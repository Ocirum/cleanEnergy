package com.cleanEnergy.cleanenergy.controller;

import com.cleanEnergy.cleanenergy.model.Usuarios;
import com.cleanEnergy.cleanenergy.service.UsuariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @PostMapping
    public Usuarios insertarUsuarios(@RequestBody Usuarios usuarios){
        return usuariosService.insertarUsuario(usuarios);
    }

    @GetMapping
    public List<Usuarios> consultarUsuarios(){

        return usuariosService.consultarUsuario();
    }

    @GetMapping("/{nombre}")
    public  List<Usuarios> consultarPorNombre(@PathVariable String nombre){
        return usuariosService.consultarPorNombre(nombre);
    }
}
