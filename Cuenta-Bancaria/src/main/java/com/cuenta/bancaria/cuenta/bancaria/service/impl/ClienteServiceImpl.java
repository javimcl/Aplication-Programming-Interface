/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuenta.bancaria.cuenta.bancaria.model.Cliente;
import com.cuenta.bancaria.cuenta.bancaria.repository.ClienteRepository;
import com.cuenta.bancaria.cuenta.bancaria.service.ClienteService;

/**
 * 
 * <b> Servicio para el cliente. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> read() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente update(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteRepository.deleteById(id);

	}

	@Override
	public Optional<Cliente> obtenerPorEstadoIdCliente(String estado, Long id) {
		return clienteRepository.findByEstadoAndClienteId(estado, id);
	}

	@Override
	public Optional<Cliente> obtenerPorId(Long id) {
		return clienteRepository.findById(id);
	}

	@Override
	public Optional<Cliente> obtenerPorIdCliente(Long id) {
		return clienteRepository.findByClienteId(id);
	}

	@Override
	public Optional<Cliente> obtenerPorIdentificacion(String identificacion) {
		return clienteRepository.findByIdentificacion(identificacion);
	}

}
