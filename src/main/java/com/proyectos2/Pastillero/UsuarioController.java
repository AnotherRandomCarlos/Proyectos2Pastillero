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

    /*Funcion para eliminar usuario*/
    @DeleteMapping(path = "/eliminarUsuario/{id}")
    public ResponseEntity eliminarUsuario (@PathVariable int id) {

        /*------------Primera parte, obtener la lista de usuarios leyendo el json existente-----------*/

        repository.deleteById(id);



        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para aniadir usuario*/
    @PostMapping(path = "/nuevoUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity aniadirUsuario (@RequestBody pruebaid nuevoUsuario) {


        repository.save(nuevoUsuario);


        return new ResponseEntity(HttpStatus.CREATED);
    }

    /*Funcion para modificar usuario*/
    @PutMapping(path = "/modificarUsuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity modificarUsuario (@RequestBody pruebaid usuarioModificado) {



        repository.save(usuarioModificado);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


}
