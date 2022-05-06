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
public class NotificacionController {

    @Autowired
    private NotificacionRepository repository;

    @GetMapping("/obtenerNotifiaciones")
    public List<Notificacion> obtenerNotificaciones(){

        List <Notificacion> lista = repository.findAll();

        return lista;
    }

    /*Funcion para aniadir correo*/
    @PostMapping(path = "/nuevaNotificacion",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity aniadirNotificacion (@RequestBody Notificacion nuevaNotificacion) {

        repository.save(nuevaNotificacion);

        return new ResponseEntity(HttpStatus.CREATED);
    }


    /*Funcion para modificar correo*/
    @PutMapping(path = "/modificarNotificacion",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity modificarNotificacion (@RequestBody Notificacion notifiacionModificada) {

        repository.save(notifiacionModificada);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }



    /*Funcion para eliminar notificacion por su id de usuario*/
    @DeleteMapping(path = "/eliminarNotificacion/{id_usuario}")
    public ResponseEntity eliminarNotificacion (@PathVariable int id_usuario) {

        repository.deleteById(id_usuario);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para encontrar la notificacion que cumpla la condicion*/
    @GetMapping("/encontrarNotificacion/{id_usuario}")
    public Notificacion encontrar(@PathVariable int id_usuario){

        List <Notificacion> lista = repository.findAll();

        Notificacion notificacionEncontrada = null;

        for(Notificacion correo : lista) {
            if(correo.getId_usuario()==id_usuario){
                notificacionEncontrada = correo;
            }
        }

        return notificacionEncontrada;
    }

}
