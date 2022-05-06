package com.proyectos2.Pastillero;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    //List<Usuario> findByName(String nombre);

}
