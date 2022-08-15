package modelo;

public class AlimentoNoPerecedero extends Alimento {
	private float cantidad;

	public String getCantidad() {
		return Float.toString(cantidad);
	}

	public void setCantidad(String cantidad) {
		this.cantidad = Float.parseFloat(cantidad);
	}
	
}
