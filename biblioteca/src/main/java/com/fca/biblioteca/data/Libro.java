package com.fca.biblioteca.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Year;

@Entity
@Table(name="libro")

public class Libro {
    @Id
    @Column(name="idLibro")
    private int idlibro;

    @Column(name="titulo")
    private String titulo;

    @Column(name="aniopublicacion")
    private Year aniopublicacion;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "edicion")
    private String edicion;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "existencia")
    private int existencia;
}
