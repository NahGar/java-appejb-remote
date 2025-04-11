package org.ngarcia.webapp.ejb.service;

import jakarta.ejb.*;
import org.ngarcia.webapp.ejb.models.Producto;

import java.util.List;

@Remote
public interface ServiceEjbRemote {

   String saludar(String nombre);
   List<Producto> listar();
   Producto crear(Producto producto);

}
