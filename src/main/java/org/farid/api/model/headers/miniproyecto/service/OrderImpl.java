package org.farid.api.model.headers.miniproyecto.service;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.OrderDTO;
import org.farid.api.model.headers.miniproyecto.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderImpl implements IService<OrderDTO> {
    @Autowired
    private OrderRepository orderRepository;

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
