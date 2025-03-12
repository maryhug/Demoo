package com.example.demoo.Modelos.DAO_Producto;

import java.util.List;

import com.example.demoo.Modelos.Entities.Producto;

public interface IProductoDAO {
        public List<Producto> findAll();
        Producto findById(Long id);
        void save(Producto producto);
        void deleteById(Long id);
}
