package com.example.demoo.Modelos.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "productos") // Asegura que el nombre de la tabla sea correcto
public class Producto {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Nombre;
    private int Cantidad;
    private Long Precio_venta;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date Fecha;

    public Producto(Long id, String nombre, int cantidad, Long precio_venta, Date fecha) {
        Id = id;
        Nombre = nombre;
        Cantidad = cantidad;
        Precio_venta = precio_venta;
        Fecha = fecha;
    }
    
    public Producto(){
        
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(Long precio_venta) {
        Precio_venta = precio_venta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

}
