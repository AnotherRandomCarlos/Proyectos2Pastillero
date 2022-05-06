package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@RestController
public class UsuarioController {

    @Autowired
    private pruebaidRepository repository;


    @GetMapping("/saludo2")
    public List<pruebaid> saludo(){

//        List<tablaprueba> lista = repository2.findAll();
//
//        tablaprueba usuario = new tablaprueba("loco", 12, "loco apellido");
//
//        repository2.save(usuario);

        List <pruebaid> lista = repository.findAll();




        return lista;
    }

    @GetMapping("/saludo3")
    public void saludo2(){

        pruebaid usuarionuevo = new pruebaid("roberto",20);


        repository.save(usuarionuevo);


        return;
    }

    @GetMapping("/saludo4")
    public Optional<pruebaid> saludo4(){

        Optional<pruebaid> usuario = repository.findById(2);


        return usuario;
    }
}
