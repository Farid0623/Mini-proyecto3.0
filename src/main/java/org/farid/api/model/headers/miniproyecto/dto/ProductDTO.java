package org.farid.api.model.headers.miniproyecto.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;




public record ProductDTO(
        @NotNull(message = "No puede ser null")
        @NotBlank
        @NotEmpty
        Integer id,
        String name,
        String description,
        double price,
        int quantity) {
}
