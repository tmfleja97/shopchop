package com.shopchop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopchop.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
