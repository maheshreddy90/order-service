package com.example.orderservice;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @GetMapping
    public List<Order> fetchOrders() {
        return List.of(Order.builder().name("Chicken").price(12.34f).id(1).build(),Order.builder().name("Mutton").price(12.34f).id(1).build());
    }
}
