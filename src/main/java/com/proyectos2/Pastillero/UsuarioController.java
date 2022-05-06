package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.PrimitiveIterator;

@RestController
public class UsuarioController {

    @Autowired
    private PrueaRepository repository2;

    @GetMapping("/saludo2")
    public List<Prueba> saludo(){

        Usuario usuario = new Usuario(10, "nombreprueba", "apellidosprueba", "carloxa49",  "12345");

        //repository.delete(medicamento);

        List<Prueba> usuarios = repository2.findAll();
        Prueba prueba = new Prueba("10","holabbdd");

        repository2.save(prueba);

        //medicamentos.add(new Medicamento("JAJAS",70));

        //usuarios.add(usuario);

        return usuarios;
    }
}
