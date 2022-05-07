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
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/obtenerUsuarios")
    public List<Usuario> obtenerUsuarios(){

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
    @GetMapping("/encontrarUsuarios/{nombre}")
    public List<Usuario> encontrarUsuarios(@PathVariable String nombre){

        List <Usuario> lista = repository.findAll();

        List <Usuario> lista2 = new ArrayList<Usuario>();

        for(Usuario user : lista) {
            if(user.getNombre().equals(nombre)){
                lista2.add(user);
            }
        }

        return lista2;
    }


    /*Funcion para el login que te devuelve el user id si es correcto el usuario y contrasenia
    * de lo contrario devuelve -1*/
    @GetMapping("/prueba/{nombre_usuario}/{contrasenia}")
    public int pruebaMultiple(@PathVariable String nombre_usuario,@PathVariable String contrasenia){

        List <Usuario> lista = repository.findAll();

        Usuario user_encontrado = null;

        for(Usuario user : lista) {
            if(user.getNombre_usuario().equals(nombre_usuario) && user.getContrasenia().equals(contrasenia)){
                user_encontrado = user;
            }
        }
        
        if(user_encontrado == null){
            return -1;
        }

        else{
            return user_encontrado.getId_usuario();
        }

    }


}
