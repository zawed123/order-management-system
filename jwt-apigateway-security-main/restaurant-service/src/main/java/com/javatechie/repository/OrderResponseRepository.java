package com.javatechie.repository;

import com.javatechie.model.OrderResponseDTO;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderResponseRepository extends JpaRepository<OrderResponseDTO,Integer> {

    OrderResponseDTO findByOrderId(int orderId);
}
