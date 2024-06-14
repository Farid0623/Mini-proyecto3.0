package org.farid.api.model.headers.miniproyecto.repository;

import org.farid.api.model.headers.miniproyecto.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Long> {
}
