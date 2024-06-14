package org.farid.api.model.headers.miniproyecto.mapper;


import org.farid.api.model.headers.miniproyecto.dto.UserDTO;
import org.farid.api.model.headers.miniproyecto.model.User;

public class UserMapper {
    public static UserDTO mapFrom(User order){
        return new UserDTO(order.getId(), order.getName(), order.getUsername(), order.getEmail(), order.getAddres(), order.getTelephone(), order.getType(), order.getPassword());
    }
    public static User mapFromDto(UserDTO orderDto){
        return User.builder()
                .id(orderDto.id())
                .name(orderDto.name())
                .username(orderDto.username())
                .email(orderDto.email())
                .addres(orderDto.address())
                .telephone(orderDto.telephone())
                .password(orderDto.password())
                .type(orderDto.type())
                .build();
    }
}
