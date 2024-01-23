package com.javatechie.client;

import com.javatechie.model.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestaurantServiceClient {
    @Autowired
    private RestTemplate template;

    public OrderResponseDTO fetchOrderStatus(int orderId) {
        return template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/" + orderId, OrderResponseDTO.class);
    }

    public OrderResponseDTO addOrder(OrderResponseDTO orderResponseDTO)
    {
        return template.postForObject("http://RESTAURANT-SERVICE/restaurant/orders/addCategory",orderResponseDTO,OrderResponseDTO.class);
    }
}
