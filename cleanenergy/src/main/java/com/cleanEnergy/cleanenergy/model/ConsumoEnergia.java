package com.cleanEnergy.cleanenergy.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ConsumoEnergia {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_consumo;

@ManyToOne
@JoinColumn(name = "documento")
private Usuarios usuario;
@ManyToOne
@JoinColumn(name = "tipo_energia")
private TiposEnergia tipoEnergia;

//hola mundo

private LocalDate fecha;

private double consumo;
private String unidadMedida;

    public ConsumoEnergia(int id_consumo, Usuarios usuario, TiposEnergia tipoEnergia, LocalDate fecha, double consumo, String unidadMedida) {
        this.id_consumo = id_consumo;
        this.usuario = usuario;
        this.tipoEnergia = tipoEnergia;
        this.fecha = fecha;
        this.consumo = consumo;
        this.unidadMedida = unidadMedida;
    }

    public ConsumoEnergia() {
    }

    public int getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(int id_consumo) {
        this.id_consumo = id_consumo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public TiposEnergia getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(TiposEnergia tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
