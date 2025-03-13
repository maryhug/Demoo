package com.example.demoo.Modelos.DAO;

import java.util.List;

import com.example.demoo.Modelos.Entities.Cliente;

public interface IClienteDAO {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente findByEmail(String email);

    public void save(Cliente cliente);

    public void deleteById(Long id);

}