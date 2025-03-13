package com.example.demoo.Modelos.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoo.Modelos.Entities.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ClienteDAOImp implements IClienteDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return em.createQuery("from Cliente", Cliente.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findByEmail(String email) {
        return em.createQuery("from Cliente where email = :email", Cliente.class).setParameter("email", email).getSingleResult();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        if (cliente.getId() != null && cliente.getId() > 0) {
            em.merge(cliente);
        } else {
            em.persist(cliente);
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Cliente cliente = findById(id);
        if (cliente != null) {
            em.remove(cliente);
        }
    }

}
