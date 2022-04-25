/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuenta.bancaria.cuenta.bancaria.model.Cuenta;

/**
 * 
 * <b> Interfaz del repositorio del Cuenta. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

	List<Cuenta> findByIdCliente(Long id);

	Optional<Cuenta> findByNumero(int numero);
}
