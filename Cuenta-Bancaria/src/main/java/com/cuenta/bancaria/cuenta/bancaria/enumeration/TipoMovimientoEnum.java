/**
 * 
 */
package com.cuenta.bancaria.cuenta.bancaria.enumeration;

/**
 * 
 * <b> Enumeracion del tipo de movimiento. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 25 abr. 2022 $]
 *          </p>
 */
public enum TipoMovimientoEnum {

	CREDITO("CRE", "credito"), DEBITO("DEB", "debito");

	private String codigo;
	private String descripcion;

	private TipoMovimientoEnum(String codigo, String descripcion) {
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
