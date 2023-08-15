package com.todocodeacademy.automovil.persistencia;

import com.todocodeacademy.automovil.logica.Automovil;
import java.util.List;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }
    
}
