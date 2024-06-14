package org.farid.api.model.headers.miniproyecto.mapper;


import org.farid.api.model.headers.miniproyecto.dto.DetailOrderDTO;
import org.farid.api.model.headers.miniproyecto.model.DetailOrder;

public class DetailOrderMapper {
    public static DetailOrderDTO mapFrom(DetailOrder order){
        return new DetailOrder(order.getId(), order.getName(), order.getQuantity(), order.getPrice(), order.getTotal());
    }
    public static DetailOrder mapFromDto(DetailOrder orderDTO){
        return DetailOrder.builder()
                .id(orderDTO.id())
                .name(orderDTO.name())
                .quantity(orderDTO.quantity())
                .price(orderDTO.precio())
                .total(orderDTO.total())
                .build();
    }
}
