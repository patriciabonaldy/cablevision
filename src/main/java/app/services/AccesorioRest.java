package app.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import app.controller.impl.AccesorioControllerImpl;
import app.modelo.Accesorio;
import app.modelo.Modelo;

@RestController
@RequestMapping(value = "/accesorio")
public class AccesorioRest {

	@Autowired
	private AccesorioControllerImpl accesorioController;	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody @Valid Accesorio accesorio) {
		accesorioController.save(accesorio);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") String id) {
    	accesorioController.delete(id);
    }
 
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<Accesorio> findAll() {
        return accesorioController.findAll();
    }
 
    @RequestMapping(value = "/findByNombre/{nombre}", method = RequestMethod.GET)
    Accesorio findByNombre(@PathVariable("nombre") String nombre) {
        return accesorioController.findByNombre(nombre);
    }
 
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    void update(@RequestBody @Valid Accesorio accesorio) {
    	accesorioController.save(accesorio);
    }
 
}
