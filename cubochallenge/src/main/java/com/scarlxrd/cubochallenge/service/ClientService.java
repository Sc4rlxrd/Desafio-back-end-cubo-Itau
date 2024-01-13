package com.scarlxrd.cubochallenge.service;

import com.scarlxrd.cubochallenge.entity.Client;
import com.scarlxrd.cubochallenge.entity.dto.ClientDto;
import com.scarlxrd.cubochallenge.repository.ClientRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.SequencedCollection;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(ClientDto clientDto){
        Client client = new Client();
        client.setFirstName(clientDto.firstName());
        client.setLastName(clientDto.lastName());
        client.setParticipation(clientDto.participation());
        clientRepository.save(client);
        if(client == null){
            throw new NullPointerException();
        }
        return client;
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

//    public ResponseEntity<Client> put(Long id , ClientDto clientDto){
//        Optional<Client> oldClient = clientRepository.findById(id);
//        if(oldClient.isPresent()){
//            Client client2 = new Client();
//            client2.setFirstName(clientDto.firstName());
//            client2.setLastName(clientDto.lastName());
//            client2.setParticipation(clientDto.participation());
//            clientRepository.save(client2);
//            return new ResponseEntity<>(HttpStatus.OK);
//
//        }
//
//        return null;
//    }

}
