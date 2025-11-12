package com.sw2f.ApiDemo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Es una entidad se le agrega el decorador
@Table(name = "Usuario")
public class Usuario {
    @Id // Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremental
    @Column(unique = true, nullable = false) // No nulo y unico
    private int idusuario;
    private String username;
    private String contrasena;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}