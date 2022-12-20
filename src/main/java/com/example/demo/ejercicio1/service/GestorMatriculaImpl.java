package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaImpl implements IGestorMatriculaService {

	
	@Qualifier("pesado")
	@Autowired
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Qualifier("liviano")
	@Autowired
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehi =  null;
		if (vehi.getTipo().equals("P")){
			this.iMatriculaServicePesado.generar("51261", "21354");
		}else {
			this.iMatriculaServiceLiviano.generar("2135", "54621");
		}
	}

}
