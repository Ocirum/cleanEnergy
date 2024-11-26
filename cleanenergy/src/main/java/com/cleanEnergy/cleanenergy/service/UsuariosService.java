package com.cleanEnergy.cleanenergy.service;

import com.cleanEnergy.cleanenergy.model.Usuarios;
import com.cleanEnergy.cleanenergy.repository.UsuariosRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuariosService {

    private UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public Usuarios insertarUsuario(Usuarios usuarios){

        try{
            return usuariosRepository.save(usuarios);
        }catch (DataAccessException e){
            throw new RuntimeException("Error al insertar usuario");
        }

    }

    public List<Usuarios> consultarUsuario(){

        return usuariosRepository.findAll();
    }

    public List<Usuarios> consultarPorNombre(String nombre){
        return usuariosRepository.findByNombre(nombre);
    }


}
