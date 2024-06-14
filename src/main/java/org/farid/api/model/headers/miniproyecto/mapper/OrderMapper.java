package org.farid.api.model.headers.miniproyecto.mapper;


import org.farid.api.model.headers.miniproyecto.dto.OrderDTO;
import org.farid.api.model.headers.miniproyecto.model.Order;

public class OrderMapper {
    public static OrderDTO mapFrom(Order order){
        return new OrderDTO(order.getId(), order.getNumber(), order.getCreateDate(),order.getReceiveDate(), order.getTotal());
    }
    public static Order mapFromDto(OrderDTO ordenDto){
        return Order.builder()
                .id(ordenDto.id())
                .number(ordenDto.number())
                .createDate(ordenDto.crationDate())
                .receiveDate(ordenDto.receivedDate())
                .total(ordenDto.total())
                .build();
    }
}
