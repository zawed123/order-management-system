package com.javatechie.service;

import com.javatechie.entity.Authenticated;
import com.javatechie.entity.UserCredential;
import com.javatechie.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserCredentialRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String saveUser(UserCredential credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);
        return "user added to the system";
    }

    public Authenticated generateToken(String email) {
       return Authenticated.builder()
                .status("Success")
                .token(jwtService.generateToken(email)).build();
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }


}
