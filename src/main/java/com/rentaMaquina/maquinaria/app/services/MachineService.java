
package com.rentaMaquina.maquinaria.app.services;

import com.rentaMaquina.maquinaria.app.entities.Machine;
import com.rentaMaquina.maquinaria.app.repositories.MachineRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class MachineService {
    
    @Autowired 
    private MachineRepository repository;
    
    // GET consultar todos los registros
    public List<Machine> getMachines(){
        return repository.findAll();
    }
    
    // `POST crear or registrar
    public Machine saveMachine(Machine machine){
        return repository.save(machine);
        
    }
    // peticion put para actualizar  (PUT)
    public Machine updateMachine(Machine machine){
        Machine existingMachine = repository.findById(machine.getId()).orElse(null);
        existingMachine.setName(machine.getName());
        existingMachine.setBrand(machine.getBrand());
        existingMachine.setModel(machine.getModel());
        existingMachine.setCategory_id(machine.getCategory_id());
        return repository.save(existingMachine);
    
    }
    
    // delete o eliminar
    public String deleteMachine(int id){
        repository.deleteById(id);
        return "Maquina eliminada"+id;
    }
}




