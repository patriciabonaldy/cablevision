package app.controller;

import java.util.List;

import app.modelo.Modelo;

public interface ModeloControler {
	
	void save(Modelo objeto);
	 
    void delete(String id);
 
    List<Modelo> findAll();
 
    Modelo findByNombre(String nombre);

}
