
package com.rentaMaquina.maquinaria.app.services;

import com.rentaMaquina.maquinaria.app.entities.Client;
import com.rentaMaquina.maquinaria.app.repositories.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class ClientService {
    
    @Autowired 
    private ClientRepository repository;
    
    // GET consultar todos los registros
    public List<Client> getClients(){
        return repository.findAll();
    }
    
    // `POST crear or registrar
    public Client saveClient(Client client){
        return repository.save(client);
        
    }
    // peticion put para actualizar  (PUT)
    public Client updateClient(Client client){
        Client existingClient = repository.findById(client.getIdClient()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setEmail(client.getEmail());
        return repository.save(existingClient);
    
    }
    
    // delete o eliminar
    public String deleteClient(int id){
        repository.deleteById(id);
        return "Cliente eliminado"+id;
    }
    
}
