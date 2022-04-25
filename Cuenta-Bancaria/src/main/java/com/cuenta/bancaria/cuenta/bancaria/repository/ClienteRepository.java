/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuenta.bancaria.cuenta.bancaria.model.Cliente;

/**
 * 
 * <b> Interfaz del repositorio del cliente. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findByEstadoAndClienteId(String estado, Long id);

	Optional<Cliente> findByClienteId(Long id);

	Optional<Cliente> findByIdentificacion(String id);

}
