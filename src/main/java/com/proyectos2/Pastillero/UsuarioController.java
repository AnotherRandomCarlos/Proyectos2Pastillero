package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;



    @GetMapping("/obtenerUsuarios")
    public List<Usuario> obtener(){

        List <Usuario> lista = repository.findAll();

        return lista;
    }

    /*Funcion para aniadir usuario*/
    @PostMapping(path = "/nuevoUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity aniadirUsuario (@RequestBody Usuario nuevoUsuario) {

        repository.save(nuevoUsuario);

        return new ResponseEntity(HttpStatus.CREATED);
    }


    /*Funcion para modificar usuario*/
    @PutMapping(path = "/modificarUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity modificarUsuario (@RequestBody Usuario usuarioModificado) {

        repository.save(usuarioModificado);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }



    /*Funcion para eliminar usuario por su id*/
    @DeleteMapping(path = "/eliminarUsuario/{id}")
    public ResponseEntity eliminarUsuario (@PathVariable int id) {

        repository.deleteById(id);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para encontrar usuarios que cumplan condicion*/
    @GetMapping("/encontrarUsuarios")
    public List<Usuario> encontrar(){

        Optional<pruebaid> usuario = null;

        List<Usuario> usuarios = repository.findByName("Carlos");
        //List<Usuario> usuarios = null;

        return usuarios;
    }



}
