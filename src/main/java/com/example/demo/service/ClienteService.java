package com.example.demo.service;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.ClienteRepository;  // Asegúrate de tener la importación correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;  // Asegúrate de que el repositorio esté inyectado

    // Obtener todos los clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();  // Llama al repositorio para obtener todos los clientes
    }

    // Obtener un cliente por su ID
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    // Guardar un nuevo cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Eliminar un cliente por su ID
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}