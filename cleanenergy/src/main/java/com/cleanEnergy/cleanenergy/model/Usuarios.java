package com.cleanEnergy.cleanenergy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuarios {
    @Id
    @Column(length = 50)
    private String documento;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "email",nullable = false,length = 50)
    private String correo;
    @Column(name = "password",nullable = false,length = 50)
    private String password;

    public Usuarios(String documento, String nombre, String correo, String password) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public Usuarios() {


    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
