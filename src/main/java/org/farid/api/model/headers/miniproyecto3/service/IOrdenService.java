package org.farid.api.model.headers.miniproyecto3.service;


import org.farid.api.model.headers.miniproyecto3.model.Orden;
import org.farid.api.model.headers.miniproyecto3.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
