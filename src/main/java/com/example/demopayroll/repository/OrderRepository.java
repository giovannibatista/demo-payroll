package com.example.demopayroll.repository;

import com.example.demopayroll.domain.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
