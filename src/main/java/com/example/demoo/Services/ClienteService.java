package com.example.demoo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoo.Modelos.DAO_Cliente.IClienteDAO;
import com.example.demoo.Modelos.Entities.Cliente;

@Service
public class ClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    public List<Cliente> listarClientes() {
        return clienteDAO.findAll();
    }

    public Cliente obtenerCliente(Long id) {
        return clienteDAO.findById(id);
    }

    public void guardarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteDAO.deleteById(id);
    }
}
