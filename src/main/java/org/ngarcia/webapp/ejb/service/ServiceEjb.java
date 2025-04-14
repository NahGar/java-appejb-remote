package org.ngarcia.webapp.ejb.service;

import jakarta.ejb.*;
import org.ngarcia.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;

//@Stateless
@Stateful
public class ServiceEjb implements ServiceEjbRemote {

   private int contador;

   public String saludar(String nombre) {
      contador ++;
      System.out.println("imprimiendo ejb: " + this);
      System.out.println("contador: " + contador);
      return "Hola que tal " + nombre;
   }

   @Override
   public List<Producto> listar() {
      List<Producto> productos = new ArrayList<>();
      productos.add(new Producto("pera"));
      productos.add(new Producto("manzana"));
      productos.add(new Producto("naranja"));
      return productos;
   }

   @Override
   public Producto crear(Producto producto) {
      System.out.println("guardando producto " + producto);
      Producto p = new Producto();
      p.setNombre(producto.getNombre());
      return p;
   }
}
