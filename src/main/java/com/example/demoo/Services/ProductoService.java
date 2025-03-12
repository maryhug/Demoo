package com.example.demoo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoo.Modelos.DAO_Producto.IProductoDAO;
import com.example.demoo.Modelos.Entities.Producto;


@Service
public class ProductoService {

    @Autowired
    private IProductoDAO productoDAO;

    public List<Producto> listarProductos() {
        return productoDAO.findAll(); // Devuelve lista completa
    }


    public Producto obtenerProducto(Long id) {
        Producto producto = productoDAO.findById(id);
        if (producto == null) {
            throw new RuntimeException("Producto no encontrado con ID: " + id);
        }
        return producto;
    }


    public void guardarProducto(Producto producto) {
        productoDAO.save(producto); // Guarda o actualiza el producto
    }

    public void eliminarProducto(Long id) {
        productoDAO.deleteById(id);
    }
}
