package app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.controller.AutoControler;
import app.modelo.Accesorio;
import app.modelo.Auto;
import app.modelo.AutoRepository;
import app.modelo.Modelo;

@Controller
public class AutoControllerImpl implements AutoControler {
	
	@Autowired
	private AutoRepository autoRepo;

	@Override
	public void save(Auto objeto) {
		// TODO Auto-generated method stub
		objeto = this.calculatedPrecio(objeto);
		autoRepo.save(objeto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Auto md = autoRepo.findById(id);
		if(md!=null)
			autoRepo.delete(md);
	}

	@Override
	public List<Auto> findAll() {
		// TODO Auto-generated method stub
		return autoRepo.findAll();
	}

	@Override
	public List<Accesorio> getAllAccesorio(String id) {
		// TODO Auto-generated method stub
		Auto md = autoRepo.findById(id);
		return autoRepo.findByAccesoriosList(id);
	}
	
	private Auto calculatedPrecio(Auto objeto){
		double precio = objeto.getPrecio();
		
		for(Accesorio a : objeto.getAccesoriosList())
			precio +=a.getPrecio();
		objeto.setPrecio(precio);
		return objeto;
	}
	
	public void actualizarAccesorios(String id, List<Accesorio> accesorio){
		Auto auto = autoRepo.findById(id);
		auto.setAccesoriosList(accesorio);
		autoRepo.save(auto);
	}


}
