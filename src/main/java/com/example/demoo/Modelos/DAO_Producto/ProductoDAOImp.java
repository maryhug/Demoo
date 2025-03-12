package com.example.demoo.Modelos.DAO_Producto;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoo.Modelos.Entities.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class ProductoDAOImp implements IProductoDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return em.createQuery("from Producto", Producto.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return em.find(Producto.class, id);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        if (producto.getId() != null && producto.getId() > 0) {
            em.merge(producto);
        } else {
            em.persist(producto);
        }
    }
    @Override
    @Transactional
    public void deleteById(Long id) {
        Producto producto = findById(id);
        if (producto != null) {
            em.remove(producto);
        }
    }
}
