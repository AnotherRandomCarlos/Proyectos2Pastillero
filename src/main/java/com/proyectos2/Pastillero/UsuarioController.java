package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.PrimitiveIterator;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @GetMapping("/saludo2")
    public List<Usuario> saludo(){

//        List<tablaprueba> lista = repository2.findAll();
//
//        tablaprueba usuario = new tablaprueba("loco", 12, "loco apellido");
//
//        repository2.save(usuario);

        List <Usuario> lista = repository.findAll();


        return lista;
    }
}
