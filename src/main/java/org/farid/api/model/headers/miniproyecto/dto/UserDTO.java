package org.farid.api.model.headers.miniproyecto.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UserDTO(Integer id,
                      @NotNull(message = "No puede ser null")
                         @NotBlank
                         @NotEmpty
                         String name,
                      String username,
                      @Email(message = "Debe ser un email válido")
                         String email,
                      @NotNull(message = "No puede ser null")
                         String address,
                      @NotNull(message = "No puede ser null")

                         @NotNull(message = "No puede ser null")
                         String telephone,
                      @NotNull(message = "No puede ser null")
                         String type,
                      String password) {
}
