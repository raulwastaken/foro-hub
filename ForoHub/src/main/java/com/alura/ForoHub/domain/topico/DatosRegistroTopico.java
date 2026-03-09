package com.alura.ForoHub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull Status status,
        @NotBlank String autor,
        @NotNull Curso curso
        ) {
    @Override
    public String toString() {
        return "DatosRegistroTopico{" +
                "titulo='" + titulo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", status=" + status +
                ", autor='" + autor + '\'' +
                ", curso=" + curso +
                '}';
    }
}
