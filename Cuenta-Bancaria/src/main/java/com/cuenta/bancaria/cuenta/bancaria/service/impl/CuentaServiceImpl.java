/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.bancaria.cuenta.bancaria.model.Cuenta;
import com.cuenta.bancaria.cuenta.bancaria.repository.CuentaRepository;
import com.cuenta.bancaria.cuenta.bancaria.service.CuentaService;

/**
 * 
 * <b> Servicio para la Cuenta. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public Cuenta create(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}

	@Override
	public List<Cuenta> read() {
		return cuentaRepository.findAll();
	}

	@Override
	public Cuenta update(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}

	@Override
	public void delete(Long id) {
		cuentaRepository.deleteById(id);

	}

	@Override
	public Optional<Cuenta> obtenerPorId(Long id) {
		return cuentaRepository.findById(id);
	}

	@Override
	public List<Cuenta> obtenerPorCliente(Long id) {
		return cuentaRepository.findByIdCliente(id);
	}

	@Override
	public Optional<Cuenta> obtenerPorNumeroCuenta(int numeroCuenta) {
		return cuentaRepository.findByNumero(numeroCuenta);
	}

}
