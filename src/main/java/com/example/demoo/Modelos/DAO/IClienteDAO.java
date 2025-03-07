package com.example.demoo.Modelos.DAO;

import java.util.List;

import com.example.demoo.Modelos.Entities.Cliente;

public interface IClienteDAO {
        public List<Cliente> findAll();
}