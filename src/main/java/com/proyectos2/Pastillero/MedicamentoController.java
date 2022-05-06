package com.proyectos2.Pastillero;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoRepository repository;

    @GetMapping("/saludo")
    public List<Medicamento> saludo(){

        Medicamento medicamento = new Medicamento(10, 4, "medicamento Prueba", "descripcion","LMX", 2,1,50);

        //repository.delete(medicamento);

        List<Medicamento> medicamentos = repository.findAll();

        //medicamentos.add(new Medicamento("JAJAS",70));

        medicamentos.add(medicamento);

        return medicamentos;
    }


}
