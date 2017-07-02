package app.controller;

import java.util.List;

import app.modelo.Accesorio;

public interface AccesorioControler {

	void delete(String id);

	List<Accesorio> findAll();

	Accesorio findByNombre(String nombre);

	void save(Accesorio objeto);

}
