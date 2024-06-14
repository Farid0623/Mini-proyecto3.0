package org.farid.api.model.headers.miniproyecto.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.*;


public record DetailOrderDTO(
        @NotNull(message = "No puede ser null")
        @NotBlank
        @NotEmpty
        Integer id,
        @NotNull(message = "No puede ser null")
        String name,
        @NotNull(message = "No puede ser null")
        double quantity,
        @NotNull(message = "No puede ser null")
        double price,
        @NotNull(message = "No puede ser null")
        double total
) {
}
