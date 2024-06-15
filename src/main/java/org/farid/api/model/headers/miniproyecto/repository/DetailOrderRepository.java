package org.farid.api.model.headers.miniproyecto.repository;

import org.farid.api.model.headers.miniproyecto.dto.DetailOrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailOrderRepository extends JpaRepository<DetailOrderDTO,Long> {
}
