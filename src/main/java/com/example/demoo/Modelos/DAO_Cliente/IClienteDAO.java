package com.example.demoo.Modelos.DAO_Cliente;

import java.util.List;

import com.example.demoo.Modelos.Entities.Cliente;

public interface IClienteDAO {
    List<Cliente> findAll();
    Cliente findById(Long id);
    void save(Cliente cliente);
    void deleteById(Long id);
}
