package com.shopchop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopchop.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Cart findByMemberId(Long memberId);
}
