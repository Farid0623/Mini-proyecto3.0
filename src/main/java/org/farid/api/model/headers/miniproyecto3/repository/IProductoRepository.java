package org.farid.api.model.headers.miniproyecto3.repository;


import org.farid.api.model.headers.miniproyecto3.model.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
