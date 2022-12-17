package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1AnApplication implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Opción 1:
		Vehiculo vehi= new Vehiculo();
		vehi.setMarca("Toyota");
		vehi.setPlaca("PDG4596");
		vehi.setPrecio(new BigDecimal(500));
		vehi.setTipo("P");
		
		this.vehiculoService.crear(vehi);
		
		vehi.setMarca("Toyota");
		vehi.setPrecio(new BigDecimal(3000));
		this.vehiculoService.modificar(vehi);
		
		//Opción 2:
		Propietario propietario = new Propietario();
		propietario.setApellido("Naranjo");
		propietario.setNombre("Anthony");
		propietario.setCedula("1725486801");
		propietario.setFechaNacimiento(LocalDateTime.of(1999, 6, 17, 8, 45));
		
		this.propietarioService.guardar(propietario);
		
		//Opción 3:
		this.matriculaService.generar(propietario.getCedula(), vehi.getPlaca());
	}

}
