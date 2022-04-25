/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.enumeration;

/**
 * 
 * <b> Enumeracion de los estados. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public enum EstadoEmun {

	ACTIVO("A", "True"), INACTIVO("I", "False");

	private String codigo;
	private String descripcion;

	private EstadoEmun(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
