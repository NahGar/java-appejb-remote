package org.ngarcia.webapp.ejb.models;

import java.io.Serializable;

public class Producto implements Serializable {

   static final long serialVersionUID = 4253452554L;

   private String nombre;

   public Producto() {
   }

   public Producto(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   @Override
   public String toString() {
      return "{" +
              "nombre='" + nombre + '\'' +
              '}';
   }
}
