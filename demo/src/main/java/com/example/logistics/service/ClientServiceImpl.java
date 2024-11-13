package com.example.logistics.service;

import com.example.logistics.dto.ClientDto;
import com.example.logistics.entities.Client;
import com.example.logistics.repositories.interfaces.ClientRepository;
import com.example.logistics.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDto getClientById(Long id) {
        return null;
        // Implement logic to fetch and return client by ID
    }

    @Override
    public List<ClientDto> getAllClients() {
        // Implement logic to fetch all clients
        return null;
    }

    @Override
    public ClientDto createClient(ClientDto clientDto) {
        Client client = new Client();
        client.setAddress(clientDto.getAddress());
        client.setName(clientDto.getName());
        client.setPhoneNumber(clientDto.getPhoneNumber());
        clientRepository.save(client);
        return null;
    }

    @Override
    public ClientDto updateClient(Long id, ClientDto clientDto) {
        // Implement logic to update and return the client
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        // Implement logic to delete a client by ID
    }
}
