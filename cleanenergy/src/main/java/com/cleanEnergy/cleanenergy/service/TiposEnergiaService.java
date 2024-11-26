package com.cleanEnergy.cleanenergy.service;

import com.cleanEnergy.cleanenergy.model.TiposEnergia;
import com.cleanEnergy.cleanenergy.repository.TiposEnergiaRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposEnergiaService {
    private final TiposEnergiaRepository tiposEnergiaRepository;

    public TiposEnergiaService(TiposEnergiaRepository tiposEnergiaRepository) {
        this.tiposEnergiaRepository = tiposEnergiaRepository;
    }

    public TiposEnergia insertarTiposEnergia(TiposEnergia tiposEnergia){
        try{
            return tiposEnergiaRepository.save(tiposEnergia)
;        }catch (DataAccessException e){
            throw new RuntimeException("Error el insertar tipo de energia");
        }
    }

    public List<TiposEnergia> consultarTiposEnergia(){
        return tiposEnergiaRepository.findAll();
    }
}
