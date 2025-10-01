// Clases limpias que envian a los diferentes modelos
package com.sw2f.ApiDemo.Models;

public class Bases {
   private int id;
   private String nombreComercial;
   private int version;

   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public String getNombreComercial() {
    return nombreComercial;
   }
   public void setNombreComercial(String nombreComercial) {
    this.nombreComercial = nombreComercial;
   }
   public int getVersion() {
    return version;
   }
   public void setVersion(int version) {
    this.version = version;
   }
}



