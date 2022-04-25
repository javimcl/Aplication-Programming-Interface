/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.bancaria.cuenta.bancaria.controller.dto.ReporteDto;
import com.cuenta.bancaria.cuenta.bancaria.model.Movimiento;
import com.cuenta.bancaria.cuenta.bancaria.repository.MovimientoRepository;
import com.cuenta.bancaria.cuenta.bancaria.service.MovimientoService;

/**
 * 
 * <b> Servicio para el Movimiento. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
@Service
public class MovimientoServiceImpl implements MovimientoService {

	@Autowired
	private MovimientoRepository movimientoRepository;

	@Override
	public Movimiento create(Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}

	@Override
	public List<Movimiento> read() {

		return movimientoRepository.findAll();
	}

	@Override
	public Movimiento update(Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}

	@Override
	public void delete(Long id) {
		movimientoRepository.deleteById(id);

	}

	@Override
	public Optional<Movimiento> obtenerPorId(Long id) {

		return movimientoRepository.findById(id);
	}

	@Override
	public List<Movimiento> obtenerPorClienteCuenta(Long idCliente, Long idCuenta) {
		return movimientoRepository.findByIdClienteAndIdCuenta(idCliente, idCuenta);
	}

	@Override
	public List<Movimiento> obtenerPorIdentificacionNumeroCuenta(String identificacion, int numeroCuenta) {
		return movimientoRepository.buscarPorClienteCuenta(identificacion, numeroCuenta);
	}

	@Override
	public Double obtenerSumaValorClienteCuentaFecha(Long clienteId, Long idCuenta, String tipoMovimiento, Date fecha) {
		return movimientoRepository.sumaValorPorClienteCuentaFecha(clienteId, idCuenta, tipoMovimiento, fecha);
	}

	@Override
	public List<ReporteDto> obtenerPorFechas(Date fechaInicial, Date fechaFinal) {
		return movimientoRepository.buscarPorEntreFechas(fechaInicial, fechaFinal);
	}

}
