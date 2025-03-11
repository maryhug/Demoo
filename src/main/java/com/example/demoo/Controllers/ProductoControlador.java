package com.example.demoo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoo.Modelos.DAO_Producto.IProductoDAO;


@Controller
public class ProductoControlador {
    
    @Autowired
    private IProductoDAO productoDAO;

    @GetMapping("/producto")
    public String Producto(Model model) {
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoDAO.findAll());
        return "producto";
    }

}
