package controlador;

import java.util.ArrayList;
import java.util.Date;
import modelo.*;

public class GestorAlimentos {

	private ArrayList<Alimento> inventarioAlimentos;
	
	public GestorAlimentos () {
		inventarioAlimentos = new ArrayList<Alimento>();
	}
	public void annadirAlimento(String nombre, String marca, String version, Date fechaCompra, float precio) {
		Alimento a = new AlimentoNoPerecedero(nombre, marca, version, fechaCompra, precio);
		annadirAlimento(a);
	}
	public void annadirAlimento(String nombre, String marca, String version, Date fechaCompra, float precio, Date fechaCaducidad) {
		Alimento a = new AlimentoPerecedero(nombre, marca, version, fechaCompra, precio, fechaCaducidad);
		annadirAlimento(a);
	}
	private void annadirAlimento (Alimento a) {
		inventarioAlimentos.add(a);
	}
	
	public Alimento getAlimentoAt(int indiceAlimento) {
		return inventarioAlimentos.get(indiceAlimento);
	}
	public void eliminarAlimentos(int indiceAlimento) {
		inventarioAlimentos.remove(indiceAlimento);
	}
	
}
