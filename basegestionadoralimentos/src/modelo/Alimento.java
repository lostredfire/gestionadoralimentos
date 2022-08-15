package modelo;

import java.util.Date;

public abstract class Alimento {
	
	private String nombre;
	private String marca;
	private String version;
	private Date fechaCompra;
	private float precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	
}
