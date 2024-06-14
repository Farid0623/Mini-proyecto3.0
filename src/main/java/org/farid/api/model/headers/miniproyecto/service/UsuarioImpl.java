package org.farid.api.model.headers.miniproyecto.service;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.UserDTO;

import java.util.List;

public class UsuarioImpl implements IService<UserDTO> {

    @Override
    public List<UserDTO> listAll() {
        return null;
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public UserDTO add(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO getByid(Long id) throws BadRequestException {
        return null;
    }


}
