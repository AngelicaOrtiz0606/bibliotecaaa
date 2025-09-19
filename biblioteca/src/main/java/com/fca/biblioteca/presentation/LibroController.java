package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class LibroController {

    /*Inyección de dependencias*/
    private LibroDomain libroDomain;
    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros-disponibles", method = RequestMethod.GET)
    @ResponseBody /*Lo convierte en un json*/
    public List<Libro> buscarLibrosPorTitulo
            (@RequestParam String titulo, @RequestParam String edicion){     /*Capa de presentación, que lo pasa a logica o usuario*/
        return libroDomain.buscarLibrosDisponibles(titulo, edicion);   /*Aca ya traemos la lista*/
    }


    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    @ResponseBody /*Lo convierte en un json*/
    public List<Libro> buscarLibros
            (@RequestParam String titulo, @RequestParam String edicion){   /*Capa de presentación, que lo pasa a logica o usuario*/
        return libroDomain.buscarLibros(titulo, edicion);   /*Aca ya traemos la lista*/
    }
}