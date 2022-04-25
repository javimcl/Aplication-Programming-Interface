/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.service;

import java.util.List;
import java.util.Optional;

import com.cuenta.bancaria.cuenta.bancaria.model.Cuenta;

/**
 * 
 * <b> Interfaz del servicio para el Cuenta. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public interface CuentaService {
	Cuenta create(Cuenta cuenta);

	List<Cuenta> read();

	Cuenta update(Cuenta cuenta);

	void delete(Long id);

	Optional<Cuenta> obtenerPorId(Long id);

	List<Cuenta> obtenerPorCliente(Long id);

	Optional<Cuenta> obtenerPorNumeroCuenta(int numeroCuenta);

}
