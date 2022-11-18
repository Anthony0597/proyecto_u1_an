package com.example.demo.tradicional;

public class Paciente {
	private String nombre;
	private String cedula;
	private String tipo;
	
	//GET Y SET
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getCedula() {
		return cedula;
	}
	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
