package com.javatechie.service;

import com.javatechie.client.RestaurantServiceClient;
import com.javatechie.model.OrderResponseDTO;
import com.javatechie.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SwiggyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(int orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
    public OrderStatus addOrder(OrderResponseDTO orderResponseDTO)
    {
        orderResponseDTO.setOrderDate(new Date());
        orderResponseDTO.setStatus("Ordered");
        orderResponseDTO.setEstimateDeliveryWindow(5);
        restaurantServiceClient.addOrder(orderResponseDTO);

        return OrderStatus.builder().orderDate(new Date())
                .status("Ordered")
                .build();
    }
}
