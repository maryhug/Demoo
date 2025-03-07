package com.example.demoo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoo.Modelos.DAO.IClienteDAO;

@Controller
public class ClienteControlador {

    @Autowired
    private IClienteDAO clienteDAO;

    @GetMapping("/listar")
    public String Listar(Model model) {
        model.addAttribute("titulo", "Listado de Clientes");
        model.addAttribute("clientes", clienteDAO.findAll());
        return "listar";
    }
    
}
