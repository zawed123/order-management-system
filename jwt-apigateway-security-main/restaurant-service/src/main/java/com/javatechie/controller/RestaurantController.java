package com.javatechie.controller;

import com.javatechie.model.OrderResponseDTO;
import com.javatechie.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping
    public String greetingMessage() {
        return service.greeting();
    }

    @PostMapping("/orders/addCategory")
    public OrderResponseDTO addOrder(@RequestBody OrderResponseDTO orderResponseDTO)
    {
       return service.addOrder(orderResponseDTO);
    }

    @GetMapping("/orders/status/{orderId}")
    public OrderResponseDTO getOrder(@PathVariable int orderId) {
        return service.getOrder(orderId);
    }
}
