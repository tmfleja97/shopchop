package com.shopchop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.shopchop.dto.ItemSearchDto;
import com.shopchop.dto.MainItemDto;
import com.shopchop.entity.Item;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    // @QueryProjection 을 이용하여 바로 Dto 객체 반환
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
