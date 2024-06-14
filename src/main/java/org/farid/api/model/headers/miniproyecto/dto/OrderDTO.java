package org.farid.api.model.headers.miniproyecto.dto;

import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;


import java.util.Date;

@Builder
public record OrderDTO(
        @NotNull(message = "No puede ser null")
        @NotBlank
        @NotEmpty
        Integer id,
        @NotNull
        @NegativeOrZero
        String number,
        Date crationDate,
        Date receivedDate,
        double total) {
}
