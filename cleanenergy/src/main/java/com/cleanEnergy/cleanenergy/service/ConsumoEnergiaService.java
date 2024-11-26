package com.cleanEnergy.cleanenergy.service;

import com.cleanEnergy.cleanenergy.model.ConsumoEnergia;
import com.cleanEnergy.cleanenergy.model.TiposEnergia;
import com.cleanEnergy.cleanenergy.model.Usuarios;
import com.cleanEnergy.cleanenergy.repository.ConsumoEnergiaRepository;
import com.cleanEnergy.cleanenergy.repository.TiposEnergiaRepository;
import com.cleanEnergy.cleanenergy.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoEnergiaService {
    private final UsuariosRepository usuariosRepository;
    private final TiposEnergiaRepository tiposEnergiaRepository;
    private final ConsumoEnergiaRepository consumoEnergiaRepository;

    public ConsumoEnergiaService(UsuariosRepository usuariosRepository, TiposEnergiaRepository tiposEnergiaRepository, ConsumoEnergiaRepository consumoEnergiaRepository) {
        this.usuariosRepository = usuariosRepository;
        this.tiposEnergiaRepository = tiposEnergiaRepository;
        this.consumoEnergiaRepository = consumoEnergiaRepository;
    }

    public ConsumoEnergia insertarConsumoEnergia(ConsumoEnergia consumoEnergia){
        Usuarios usuarios = usuariosRepository.findById(consumoEnergia.getUsuario().getDocumento())
                .orElseThrow(()->new IllegalArgumentException("Usuario no encontrado"));

        TiposEnergia tiposEnergia= tiposEnergiaRepository.findById(consumoEnergia.getTipoEnergia().getId_energia())
                .orElseThrow(()->new IllegalArgumentException("Tipo de energia no encontrado"));
        return consumoEnergiaRepository.save(consumoEnergia);
    }

    public List<ConsumoEnergia> consultarConsumoEnergia(){
        return consumoEnergiaRepository.findAll();
    }
}
