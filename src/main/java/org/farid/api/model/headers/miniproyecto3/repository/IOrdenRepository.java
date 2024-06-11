package org.farid.api.model.headers.miniproyecto3.repository;


import org.farid.api.model.headers.miniproyecto3.model.Orden;
import org.farid.api.model.headers.miniproyecto3.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}
