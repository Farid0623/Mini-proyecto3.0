package org.farid.api.model.headers.miniproyecto.repository;

import org.farid.api.model.headers.miniproyecto.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDTO,Long> {
}
