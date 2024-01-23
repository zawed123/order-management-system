package com.javatechie.controller;

import com.javatechie.model.OrderResponseDTO;
import com.javatechie.model.OrderStatus;
import com.javatechie.service.SwiggyAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swiggy")
public class SwiggyAppController {

    @Autowired
    private SwiggyAppService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @PostMapping("/addOrder")
    public OrderStatus addOrder(@RequestBody OrderResponseDTO orderResponseDTO)
    {
        return service.addOrder(orderResponseDTO);
    }

    @GetMapping("/{orderId}")
    public OrderResponseDTO checkOrderStatus(@PathVariable int orderId) {
        return service.checkOrderStatus(orderId);
    }
}
