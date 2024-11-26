package com.cleanEnergy.cleanenergy.repository;

import com.cleanEnergy.cleanenergy.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios,String> {


    List<Usuarios> findByNombre(String nombre);

}
