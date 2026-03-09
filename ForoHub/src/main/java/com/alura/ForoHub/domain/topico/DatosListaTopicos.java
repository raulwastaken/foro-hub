package com.alura.ForoHub.domain.topico;

import java.time.LocalDateTime;

public record DatosListaTopicos(
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        Status status,
        String autor,
        Curso curso
) {
    public DatosListaTopicos(Topico topico){
        this(
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaDeCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
