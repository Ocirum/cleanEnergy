package com.cleanEnergy.cleanenergy.controller;

import com.cleanEnergy.cleanenergy.model.ConsumoEnergia;
import com.cleanEnergy.cleanenergy.service.ConsumoEnergiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumosEnergia")
public class ConsumoEnergiaController {

    private final ConsumoEnergiaService consumoEnergiaService;

    public ConsumoEnergiaController(ConsumoEnergiaService consumoEnergiaService) {
        this.consumoEnergiaService = consumoEnergiaService;
    }

    @PostMapping
    public ConsumoEnergia insertarConsumoEnergia(@RequestBody ConsumoEnergia consumoEnergia){
        return consumoEnergiaService.insertarConsumoEnergia(consumoEnergia);
    }

    @GetMapping
    public List<ConsumoEnergia> consultarConsumoEnergia(){
        return consumoEnergiaService.consultarConsumoEnergia();
    }
}
