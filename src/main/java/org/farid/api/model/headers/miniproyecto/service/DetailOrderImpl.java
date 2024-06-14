package org.farid.api.model.headers.miniproyecto.service;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.DetailOrderDTO;

import java.util.List;

public class DetailOrderImpl implements IService<DetailOrderDTO> {
    @Override
    public List<DetailOrderDTO> listAll() {
        return null;
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public DetailOrderDTO add(DetailOrderDTO user) {
        return null;
    }

    @Override
    public DetailOrderDTO getByid(Long id) throws BadRequestException {
        return null;
    }

    }
