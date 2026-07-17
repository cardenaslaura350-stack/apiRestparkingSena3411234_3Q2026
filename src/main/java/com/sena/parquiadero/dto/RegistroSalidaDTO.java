package com.sena.parquiadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {

	private long idregistro;
	private String placa;
	private double valorCobrado;
	private long horasEstadia;

}
