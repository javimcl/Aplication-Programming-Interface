/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.service;

import java.util.List;
import java.util.Optional;

import com.cuenta.bancaria.cuenta.bancaria.model.Cliente;

/**
 * 
 * <b> Interfaz del servicio para el cliente. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public interface ClienteService {
	Cliente create(Cliente cliente);

	List<Cliente> read();

	Cliente update(Cliente cliente);

	void delete(Long id);

	Optional<Cliente> obtenerPorEstadoIdCliente(String estado, Long id);

	Optional<Cliente> obtenerPorId(Long id);

	Optional<Cliente> obtenerPorIdCliente(Long id);

	// List<Cliente> obtenerPorIdPersona(Long id);

	Optional<Cliente> obtenerPorIdentificacion(String identificacion);

}
