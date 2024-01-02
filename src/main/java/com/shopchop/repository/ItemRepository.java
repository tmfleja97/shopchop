package com.shopchop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopchop.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Long>, ItemRepositoryCustom {
}
