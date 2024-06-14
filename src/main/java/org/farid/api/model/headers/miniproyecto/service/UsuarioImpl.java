package org.farid.api.model.headers.miniproyecto.service;

import co.edu.co.proyecto_spring.dto.UsuarioDto;
import org.apache.coyote.BadRequestException;

import java.util.List;

public class UsuarioImpl implements IService<UsuarioDto> {

    @Override
    public List<UsuarioDto> listAll() {
        return null;
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public UsuarioDto add(UsuarioDto user) {
        return null;
    }

    @Override
    public UsuarioDto getById(Long id) throws BadRequestException {
        return null;
    }
}
