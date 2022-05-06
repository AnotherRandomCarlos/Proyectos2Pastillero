package com.proyectos2.Pastillero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


@SpringBootApplication
public class PastilleroApplication implements CommandLineRunner{

	@Autowired
	private MedicamentoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PastilleroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//Medicamento medicamento = new Medicamento("Paracetamol",200);


		//repository.delete(medicamento);

		List<Medicamento> medicamentos = repository.findAll();

		medicamentos.forEach(System.out :: println);

		System.out.println(repository.count());

	}
}
