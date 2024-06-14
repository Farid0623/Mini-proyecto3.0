package org.farid.api.model.headers.miniproyecto.repository;

import org.farid.api.model.headers.miniproyecto.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
