package com.cleanEnergy.cleanenergy.controller;

import com.cleanEnergy.cleanenergy.model.TiposEnergia;
import com.cleanEnergy.cleanenergy.service.TiposEnergiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposEnergia")
public class TiposEnergiaController {

    private final TiposEnergiaService tiposEnergiaService;

    public TiposEnergiaController(TiposEnergiaService tiposEnergiaService) {
        this.tiposEnergiaService = tiposEnergiaService;
    }

    @PostMapping
    public TiposEnergia insertarTiposEnergia(@RequestBody TiposEnergia tiposEnergia){
        return tiposEnergiaService.insertarTiposEnergia(tiposEnergia);
    }

    @GetMapping
    public List<TiposEnergia> consultarTiposEnergia(){
        return tiposEnergiaService.consultarTiposEnergia();
    }


}
