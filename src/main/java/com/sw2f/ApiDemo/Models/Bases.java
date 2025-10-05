// Clases limpias que envian a los diferentes modelos
package com.sw2f.ApiDemo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Es una entidad se le agrega el decorador
@Entity
@Table(name = "Bases")
public class Bases {
   @Id // Llave primaria
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremental
   @Column(unique = true, nullable = false) // No nulo y unico
   private int Id;

   @Column(unique = true, nullable = false)
   private String NombreComercial;
   private int VersionBd;

   public int getId() {
    return Id;
   }
   public void setId(int id) {
    this.Id = id;
   }
   public String getNombreComercial() {
    return NombreComercial;
   }
   public void setNombreComercial(String nombreComercial) {
    this.NombreComercial = nombreComercial;
   }
   public int getVersion() {
    return VersionBd;
   }
   public void setVersion(int version) {
    this.VersionBd = version;
   }
}



