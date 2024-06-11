package org.farid.api.model.headers.miniproyecto3.repository;


import org.farid.api.model.headers.miniproyecto3.model.DetalleOrden;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
