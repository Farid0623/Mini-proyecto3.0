package org.farid.api.model.headers.miniproyecto.service;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.OrderDTO;

import java.util.List;

public class OrderImpl implements IService<OrderDTO> {

    @Override
    public List<OrderDTO> listAll() {
        return null;
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public OrderDTO add(OrderDTO user) {
        return null;
    }

    @Override
    public OrderDTO getByid(Long id) throws BadRequestException {
        return null;
    }


}
