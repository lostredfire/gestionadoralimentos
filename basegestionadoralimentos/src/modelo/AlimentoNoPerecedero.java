package modelo;

import java.util.Date;

public class AlimentoNoPerecedero extends Alimento {
	private float cantidad;

	public AlimentoNoPerecedero(String nombre, String marca, String version, Date fechaCompra, float precio) {
		super(nombre, marca, version, fechaCompra, precio);
		
	}
	public String getCantidad() {
		return Float.toString(cantidad);
	}

	public void setCantidad(String cantidad) {
		this.cantidad = Float.parseFloat(cantidad);
	}
	
}
