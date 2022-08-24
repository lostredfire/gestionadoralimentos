package modelo;

import java.util.Date;

public class AlimentoPerecedero extends Alimento {
	private Date fechaCaducidad;
	private int cantidad;
	
	public AlimentoPerecedero(String nombre, String marca, String version, Date fechaCompra, float precio, Date fechaCaducidad) {
		super(nombre, marca, version, fechaCompra, precio);
		this.fechaCaducidad = fechaCaducidad;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getCantidad() {
		return Integer.toString(cantidad);
	}
	public void setCantidad(String cantidad) {
		this.cantidad = Integer.parseInt(cantidad);
	}
	
}
