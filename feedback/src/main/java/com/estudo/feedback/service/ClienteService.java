package com.estudo.feedback.service;

import com.estudo.feedback.api.request.ClienteRequest;
import com.estudo.feedback.api.response.ClienteResponse;
import com.estudo.feedback.domain.dto.ClienteDTO;
import com.estudo.feedback.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public ClienteDTO salvar(ClienteDTO clienteDTO) {
        ClienteDTO cliente = new ClienteDTO();
        return cliente;
    }

    public List<ClienteDTO> buscar(ClienteDTO clienteDTO) {
        List<ClienteDTO> clientes = new ArrayList<>();
        return clientes;
    }

    public ClienteDTO atualizar(ClienteDTO clienteDTO) {
        return null;
    }
    public ClienteResponse salvar(ClienteRequest request){
        return null;
    }


    public ClienteDTO remover(ClienteDTO clienteDTO) {
        return null;
    }

}
