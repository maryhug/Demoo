package com.example.demoo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoo.Modelos.DAO.IClienteDAO;
import com.example.demoo.Modelos.Entities.Cliente;

@Service
public class ClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    public List<Cliente> listarClientes() {

        return clienteDAO.findAll(); // Devuelve lista completa

    }

    public Cliente obtenerCliente(Long id) {

        Cliente cliente = clienteDAO.findById(id);
        if (cliente == null) {
            throw new RuntimeException("Cliente no encontrado con ID: " + id);
        }
        return cliente;
    }

    public void guardarCliente(Cliente cliente) {
        clienteDAO.save(cliente); // Guarda o actualiza el cliente
    }

    public void eliminarCliente(Long id) {
        clienteDAO.deleteById(id);
    }

}
