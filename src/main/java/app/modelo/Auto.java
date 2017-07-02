package app.modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Auto extends Modelo {
	@Id
	private String id;
	private List<Accesorio> accesoriosList = new ArrayList<Accesorio>();
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Auto(String nombre, double precio, List<Accesorio> accesoriosList) {
		super(nombre, precio);
		this.accesoriosList = accesoriosList;
	}

	public void setAccesoriosList(List<Accesorio> accesoriosList) {
		this.accesoriosList = accesoriosList;
	}
	
	public String getNombre() {
		return super.getNombre();
	}

	public List<Accesorio> getAccesoriosList() {
		return accesoriosList;
	}
	
	public Modelo getModelo() {
		return (Modelo) this;
	}
	

}
