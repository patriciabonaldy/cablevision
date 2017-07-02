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

import app.controller.impl.AutoControllerImpl;
import app.modelo.Accesorio;
import app.modelo.Auto;

@RestController
@RequestMapping(value = "/auto")
public class AutoRest {

	@Autowired
	private AutoControllerImpl autoController;	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody @Valid Auto auto) {
		autoController.save(auto);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") String id) {
    	autoController.delete(id);
    }
 
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<Auto> findAll() {
        return autoController.findAll();
    }
  
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    void update(@RequestBody @Valid Auto auto) {
    	autoController.save(auto);
    }
 
}
