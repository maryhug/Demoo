package com.example.demoo.Modelos.Entities;

import java.time.LocalDate;
import java.util.Date;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int cantidad;
    private Double precioVenta; // Cambio de Long a Double

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    public Producto(Long id, String nombre, int cantidad, Double precioVenta, LocalDate fecha) { // Cambio de Long a Double
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.fecha = fecha;
    }

    public Producto() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioVenta() { // Cambio del tipo de retorno
        return (precioVenta != null) ? precioVenta : 0.0; // Cambio 0L a 0.0
    }

    public void setPrecioVenta(Double precioVenta) { // Cambio de Long a Double
        this.precioVenta = precioVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
