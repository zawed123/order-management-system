package com.javatechie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderStatus
{
    private String status;
    private Date orderDate;
}
