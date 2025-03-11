package com.example.demoo.Modelos.DAO_Producto;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoo.Modelos.Entities.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class ProductoDAOImp implements IProductoDAO{
    
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Producto> findAll() {
        return em.createQuery("from Producto").getResultList();

    }

}
