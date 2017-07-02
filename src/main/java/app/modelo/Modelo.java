package app.modelo;

import org.springframework.data.annotation.Id;


public class Modelo{
	private String nombre;
	private double precio;
	
	
	public Modelo() {
		super();
	}
	public Modelo(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Modelo [nombre=" + nombre + ", precio=" + precio + "]";
	}	
	
	
}
