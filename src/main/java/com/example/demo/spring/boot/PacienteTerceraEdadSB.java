package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteTerceraEdadSB extends PacienteSB{
	private String codigoIESS;

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}
	
	@Override
	public Integer calcularDescuento() {
		System.out.println("Paciente con el 20% descuento");
		return 20;
	}

	@Override
	public String toString() {
		return "PacienteTerceraEdadSB [codigoIESS=" + codigoIESS + ", getNombre()=" + getNombre() + ", getCedula()="
				+ getCedula() + ", getTipo()=" + getTipo() + "]";
	}
	
	
}
