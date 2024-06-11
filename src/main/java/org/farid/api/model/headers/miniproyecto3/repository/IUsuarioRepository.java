package org.farid.api.model.headers.miniproyecto3.repository;

import org.farid.api.model.headers.miniproyecto3.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByEmail(String email);
}
