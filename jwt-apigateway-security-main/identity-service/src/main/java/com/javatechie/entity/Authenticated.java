package com.javatechie.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Authenticated {

    private String status;
    private String token;
}
