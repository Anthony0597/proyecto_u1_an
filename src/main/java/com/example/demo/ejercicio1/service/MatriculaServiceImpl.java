package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repo.IMatriculaRepository;


@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(this.propietarioService.buscar(cedula));
		matricula.setVehiculo(this.vehiculoService.buscar(placa));
		matricula.setValor(this.calcularValor(this.vehiculoService.buscar(placa)));
		this.matriculaRepository.insertar(matricula);
		System.out.println("Se ha generado la matricula: "+matricula);
		
	}
	
	public BigDecimal calcularValor(Vehiculo vehiculo) {
		BigDecimal valor = null;
		
		if(vehiculo.getTipo().equals("P")) {
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}else if (vehiculo.getTipo().equals("L")){
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.1));
		}
		
		if(valor.compareTo(new BigDecimal(2000))==1) {
			valor=valor.subtract(valor.multiply(new BigDecimal(0.07)));
		}
		return valor;
	}

}
