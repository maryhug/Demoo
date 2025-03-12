package com.example.demoo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demoo.Services.ProductoService;
import com.example.demoo.Modelos.Entities.Producto;

@Controller
@RequestMapping("/producto")
public class ProductoControlador {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarProductos());
        model.addAttribute("titulo", "Lista de Productos");
        return "producto";
    }

    @GetMapping("/agregar")
    public String formularioNuevo(Model model) {
        model.addAttribute("producto", new Producto());
        return "producto-form";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/producto/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarProducto(@PathVariable Long id, Model model) {
        model.addAttribute("producto", productoService.obtenerProducto(id));
        return "producto-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/producto/listar";
    }
}
