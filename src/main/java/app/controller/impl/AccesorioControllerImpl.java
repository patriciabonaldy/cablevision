package app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.controller.AccesorioControler;
import app.modelo.Accesorio;
import app.modelo.AccesorioRepository;
import app.modelo.Modelo;

@Controller
public class AccesorioControllerImpl implements AccesorioControler {
	
	@Autowired
	private AccesorioRepository aRep;

	@Override
	public void save(Accesorio objeto) {
		// TODO Auto-generated method stub
		aRep.save(objeto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Accesorio accesorio = aRep.findById(id);
		if(accesorio!=null)
			aRep.delete(accesorio);
	}

	@Override
	public List<Accesorio> findAll() {
		// TODO Auto-generated method stub
		return aRep.findAll();
	}

	@Override
	public Accesorio findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return aRep.findByNombre(nombre);
	}


}
