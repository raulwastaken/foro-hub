package com.alura.ForoHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosDetalleForo(
        Long Id,
       String titulo,
       String mensaje,
       LocalDateTime fechaDeCreacion,
       Status status,
       String autor,
       Curso curso
){
    public DatosDetalleForo(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaDeCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }

}
