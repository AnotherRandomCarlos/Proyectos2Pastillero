package com.proyectos2.Pastillero;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoRepository repository2;

    @GetMapping("/obtenerMedicamentos")
    public List<Medicamento> obtenerMedicamentos(){

        List <Medicamento> lista = repository2.findAll();

        return lista;
    }

    /*Funcion para aniadir medicamentos*/
    @PostMapping(path = "/nuevoMedicamento",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity aniadirMedicamento (@RequestBody Medicamento nuevoMedicamento) {

        repository2.save(nuevoMedicamento);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    /*Funcion para modificar medicamento*/
    @PutMapping(path = "/modificarMedicamento",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity modificarMedicamento (@RequestBody Medicamento medicamentoModificado) {

        repository2.save(medicamentoModificado);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para eliminar medicamento por su id*/
    @DeleteMapping(path = "/eliminarMedicamento/{id}")
    public ResponseEntity eliminarUsuario (@PathVariable int id) {

        repository2.deleteById(id);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    /*Funcion para encontrar medicamento que cumplan condicion de user id*/
    @GetMapping("/encontrarMedicamentos/{user_id}")
    public List<Medicamento> encontrarMedicamentos(@PathVariable int user_id){

        List <Medicamento> lista = repository2.findAll();

        List <Medicamento> lista2 = new ArrayList<Medicamento>();

        for(Medicamento medicamento : lista) {
            if(medicamento.getId_usuario()==user_id){
                lista2.add(medicamento);
            }
        }

        return lista2;
    }


}
