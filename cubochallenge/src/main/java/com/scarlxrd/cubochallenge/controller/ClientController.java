package com.scarlxrd.cubochallenge.controller;

import com.scarlxrd.cubochallenge.entity.Client;
import com.scarlxrd.cubochallenge.entity.dto.ClientDto;
import com.scarlxrd.cubochallenge.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientDto clientDto){
        Client client=clientService.saveClient(clientDto);
        return ResponseEntity.ok().body(client);
    }
    @GetMapping
    public ResponseEntity<List<Client>> getAll(){
        List<Client> clientList = clientService.getAll();
        return ResponseEntity.ok().body(clientList);
    }

}
