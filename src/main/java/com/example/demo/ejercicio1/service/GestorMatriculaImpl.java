package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repo.IMatriculaRepository;

@Service
public class GestorMatriculaImpl implements IGestorMatriculaService {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Qualifier("pesado")
	@Autowired
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Qualifier("liviano")
	@Autowired
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Override
	public void matricular(String cedula, String placa) {
		
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(this.propietarioService.buscar(cedula));
		matricula.setVehiculo(this.vehiculoService.buscar(placa));			
		
		Vehiculo vehi =  this.vehiculoService.buscar(placa);
		BigDecimal valor= null;
		if (vehi.getTipo().equals("P")){
			valor = this.iMatriculaServicePesado.generar(vehi.getPrecio());
			System.out.println("Su vehículo es: PESADO");
		}else {
			valor = this.iMatriculaServiceLiviano.generar(vehi.getPrecio());
			System.out.println("Su vehículo es: LIVIANO");
		}
		
		//programo descuento
		if(valor.compareTo(new BigDecimal(2000))==1) {
			valor=valor.subtract(valor.multiply(new BigDecimal(0.07)));
		}
		
		matricula.setValor(valor);
		this.matriculaRepository.insertar(matricula);
		System.out.println("Se matriculó el vehiculo: "+ matricula);
		System.out.println("El valor fue: "+ valor);
		
	}

}
