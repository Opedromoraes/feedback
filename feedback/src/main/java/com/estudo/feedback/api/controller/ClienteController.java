package com.estudo.feedback.api.controller;

import com.estudo.feedback.api.controller.impl.IClienteController;
import com.estudo.feedback.api.request.ClienteRequest;
import com.estudo.feedback.api.response.ClienteResponse;
import com.estudo.feedback.domain.dto.ClienteDTO;
import com.estudo.feedback.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController implements IClienteController {
    @Autowired
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @Override
    public ClienteResponse create(ClienteRequest clienteRequest) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setEmail(clienteRequest.getEmail());
        clienteDTO.setNome(clienteRequest.getNome());
        service.salvar(clienteDTO);
        return null;
    }


    @Override
    public ClienteResponse findAll() {
        return null;
    }

    @Override
    public ClienteRequest update(ClienteRequest clienteRequest, Long id) {
        return null;
    }

    @Override
    public ClienteRequest delete(Long id) {
        return null;
    }

}
