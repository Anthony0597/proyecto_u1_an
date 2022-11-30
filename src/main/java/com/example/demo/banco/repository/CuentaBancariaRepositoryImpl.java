package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		
		CuentaBancaria cuenta = null;
		
		/*cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(1000));
		cuenta.setTipo("A");
		cuenta.setTitular("Edison Cayambe");*/
		
		for (CuentaBancaria cb : baseCuentas){
			if(cb.getNumero().equals(numeroCuenta)) {
				cuenta = cb;
			}
		}
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta: "+ id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza la cuenta: "+cuentaBancaria);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta la cuenta : "+ cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se borra la cuenta: "+ id);
	}

}
