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

import app.controller.impl.ModeloControllerImpl;
import app.modelo.Modelo;

@RestController
@RequestMapping(value = "/modelo")
public class ModeloRest {

	@Autowired
	private ModeloControllerImpl modeloController;	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody @Valid Modelo modelo) {
        modeloController.save(modelo);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") String id) {
    	modeloController.delete(id);
    }
 
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<Modelo> findAll() {
        return modeloController.findAll();
    }
 
    @RequestMapping(value = "/findByNombre/{nombre}", method = RequestMethod.GET)
    Modelo findByNombre(@PathVariable("nombre") String nombre) {
        return modeloController.findByNombre(nombre);
    }
 
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    void update(@RequestBody @Valid Modelo modelo) {
       modeloController.save(modelo);
    }
 
}
