package com.filosofos.solo5;

public class Filosofo {
	private String nombre;
	private double tiempocomido;
	
	
	public Filosofo(String nombre, double tiempocomido) {
		super();
		this.nombre = nombre;
		this.tiempocomido = tiempocomido;
	}
	
	
	public Filosofo(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTiempocomido() {
		return tiempocomido;
	}
	public void setTiempocomido(double tiempocomer) {
		this.tiempocomido = tiempocomer;
	}
	
	

}
