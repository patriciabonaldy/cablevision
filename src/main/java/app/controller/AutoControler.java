package app.controller;

import java.util.List;

import app.modelo.Accesorio;
import app.modelo.Auto;

public interface AutoControler {

	void save(Auto objeto);

	void delete(String id);

	List<Auto> findAll();

	List<Accesorio> getAllAccesorio(String id);

}
