package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autorlibro")
public class AutorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idautorlibro")
    private int idAutorLibro;

    @Column(name = "idautor")
    private int idAutor;

    @Column(name = "idlibro")
    private int idLibro;
}