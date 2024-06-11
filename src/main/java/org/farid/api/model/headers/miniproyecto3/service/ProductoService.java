package org.farid.api.model.headers.miniproyecto3.service;


import org.farid.api.model.headers.miniproyecto3.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
	Producto save(Producto producto);
	Optional<Producto> get(Integer id);
	void update(Producto producto);
	void delete(Integer id);
	List<Producto> findAll();

}
