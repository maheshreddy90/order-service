package com.example.orderservice;

import lombok.Builder;

@Builder
public record Order(int id, String name, float price) {

}
