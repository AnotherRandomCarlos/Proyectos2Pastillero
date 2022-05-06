package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository2;

    @GetMapping("/saludo2")
    public List<Usuario> saludo(){

        Usuario usuario = new Usuario(10, "nombreprueba", "apellidosprueba", "carloxa49",  "12345");

        //repository.delete(medicamento);

        List<Usuario> usuarios = repository2.findAll();

        //medicamentos.add(new Medicamento("JAJAS",70));

        usuarios.add(usuario);

        return usuarios;
    }
}
