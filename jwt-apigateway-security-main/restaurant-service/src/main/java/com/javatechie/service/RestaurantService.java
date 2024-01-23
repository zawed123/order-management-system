package com.javatechie.service;

import com.javatechie.model.OrderResponseDTO;
import com.javatechie.repository.OrderResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

     @Autowired
     private OrderResponseRepository orderResponseRepository;

    public String greeting() {
        return "Welcome to Swiggy Restaurant service";
    }

    public OrderResponseDTO addOrder(OrderResponseDTO orderResponseDTO)
    {
      return orderResponseRepository.save(orderResponseDTO);
    }
    public OrderResponseDTO getOrder(int orderId) {
        return orderResponseRepository.findByOrderId(orderId);
    }
}
