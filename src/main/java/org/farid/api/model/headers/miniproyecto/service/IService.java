package org.farid.api.model.headers.miniproyecto.service;

import org.apache.coyote.BadRequestException;

import java.util.List;

public interface IService<T> {
    List<T> listAll();
    void remover(Long id);
    T add(T user);
    T getByid(Long id) throws BadRequestException;
}
