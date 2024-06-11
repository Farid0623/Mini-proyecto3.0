package org.farid.api.model.headers.miniproyecto3.service;


import org.farid.api.model.headers.miniproyecto3.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);

}
