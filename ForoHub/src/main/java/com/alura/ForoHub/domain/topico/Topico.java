package com.alura.ForoHub.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "topicos")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo; 
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    private Boolean activo;


    public Topico(){};

    public Topico(DatosRegistroTopico datos){
        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
        this.status = datos.status();
        this.autor = datos.autor();
        this.curso = datos.curso();
        this.activo = true;
    }

    @Override
    public String toString() {
        return "Topico{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", status=" + status +
                ", autor='" + autor + '\'' +
                ", curso=" + curso +
                '}';
    }

    public void actualizarTopico(@Valid DatosActualizarTopico datos){
        if (datos.titulo() != null){
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null){
            this.mensaje = datos.mensaje();
        }
        if(datos.status() != null){
            this.status = datos.status();
        }
        if (datos.curso() != null){
            this.curso = datos.curso();
        }
    }

    public void eliminar() {
        this.activo = false;
    }

}



