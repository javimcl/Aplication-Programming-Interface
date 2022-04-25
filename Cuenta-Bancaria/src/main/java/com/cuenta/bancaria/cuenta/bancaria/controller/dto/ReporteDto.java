package com.cuenta.bancaria.cuenta.bancaria.controller.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * <b> Interfaz para obtener los datos del reporte entre fechas. </b>
 * 
 * @author Javier Lucero
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Javier Lucero $, $Date: 24 abr. 2022 $]
 *          </p>
 */
public interface ReporteDto {

	public Date getFecha();

	public String getNombre();

	public int getNumero();

	public String getTipoCuenta();

	public BigDecimal getSaldoAnterior();

	public String getEstado();

	public BigDecimal getValor();

	public BigDecimal getSaldo();

}
