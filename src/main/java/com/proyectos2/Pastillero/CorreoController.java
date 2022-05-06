package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@RestController
public class CorreoController {

    @Autowired
    private CorreoRepository repository;

    @GetMapping("/obtenerCorreos")
    public List<Correo> obtenerCorreos(){

        List <Correo> lista = repository.findAll();

        return lista;
    }

    /*Funcion para aniadir correo*/
    @PostMapping(path = "/nuevoCorreo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity aniadirCorreo (@RequestBody Correo nuevoCorreo) {

        repository.save(nuevoCorreo);

        return new ResponseEntity(HttpStatus.CREATED);
    }


    /*Funcion para modificar correo*/
    @PutMapping(path = "/modificarCorreo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity modificarCorreo (@RequestBody Correo correoModificado) {

        repository.save(correoModificado);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }



    /*Funcion para eliminar correo por su id de usuario*/
    @DeleteMapping(path = "/eliminarCorreo/{id_usuario}")
    public ResponseEntity eliminarCorreo (@PathVariable int id_usuario) {

        repository.deleteById(id_usuario);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para encontrar el correo que cumpla la condicion*/
    @GetMapping("/encontrarCorreos/{id_usuario}")
    public Correo encontrar(@PathVariable int id_usuario){

        List <Correo> lista = repository.findAll();

        Correo correoEncontrado = null;

        for(Correo correo : lista) {
            if(correo.getId_usuario()==id_usuario){
                correoEncontrado = correo;
            }
        }

        return correoEncontrado;
    }


}
