package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Order;

public interface OrderRepositoty extends CrudRepository<Order, String> {

}
