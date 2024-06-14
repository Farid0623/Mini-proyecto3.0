package org.farid.api.model.headers.miniproyecto.mapper;


import org.farid.api.model.headers.miniproyecto.dto.ProductDTO;
import org.farid.api.model.headers.miniproyecto.model.Product;

public class ProductMapper {
    public static ProductDTO mapFrom(Product order){
        return new ProductDTO(order.getId(), order.getName(),order.getDescription(), order.getPrice(), order.getQuantity());
    }
    public static Product mapFromDto(ProductDTO orderDto){
        return Product.builder()
                .id(orderDto.id())
                .name(orderDto.name())
                .description(orderDto.description())
                .price(orderDto.price())
                .quantity(orderDto.quantity())
                .build();
    }
}
