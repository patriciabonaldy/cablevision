package app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.controller.ModeloControler;
import app.modelo.Modelo;
import app.modelo.ModeloRepository;

@Controller
public class ModeloControllerImpl implements ModeloControler {
	
	@Autowired
	private ModeloRepository pr;

	@Override
	public void save(Modelo objeto) {
		// TODO Auto-generated method stub
		pr.save(objeto);
	}

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		Modelo md = this.findByNombre(nombre);
		if(md!=null)
			pr.delete(md);
	}

	@Override
	public List<Modelo> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Modelo findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return pr.findByNombre(nombre);
	}


}
