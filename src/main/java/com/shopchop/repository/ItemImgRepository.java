package com.shopchop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopchop.entity.ItemImg;

import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);
    ItemImg findByItemIdAndRepimgYn(Long itemId, String repimgYn);
}
