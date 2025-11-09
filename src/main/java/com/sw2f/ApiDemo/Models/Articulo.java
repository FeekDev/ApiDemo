package com.sw2f.ApiDemo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Es una entidad se le agrega el decorador
@Table(name = "Articulo")
/* le dice a JPA en qué tabla de la base de datos 
debe interactuar una entidad cuando se realizan 
operaciones como persistencia, borrado o selección.  */
public class Articulo {
    @Id // Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremental
    @Column(unique = true, nullable = false) // No nulo y unico
    private int codigo_articulo;
    private String nombre_articulo;
    private float precio_articulo;

    @Column(unique = true, nullable = false)
    private String nombre_proveedor;
    private int stock_articulo;

    public int getCodigo_articulo() {
        return codigo_articulo;
    }
    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }
    public String getNombre_articulo() {
        return nombre_articulo;
    }
    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }
    public double getPrecio_articulo() {
        return precio_articulo;
    }
    public void setPrecio_articulo(float precio_articulo) {
        this.precio_articulo = precio_articulo;
    }
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }
    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    public int getStock_articulo() {
        return stock_articulo;
    }
    public void setStock_articulo(int stock_articulo) {
        this.stock_articulo = stock_articulo;
    }

    
}
