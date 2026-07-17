package com.sena.parquiadero.dto;

import com.sena.parquiadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TarifaDTO {

	private Long idTarifa;
	@NotNull(message = "El tipo de vehiculo es oblicatorio")
	private TipoVehiculo tipoVehiculo;
	@NotNull(message = "la tarifa por hora es obligatoria")
	@Positive(message = "La tarifa por hora debe ser mayor a cero")
	private Double tarifaPorHora;
	@NotNull(message = "la tarifa por dia es obligatoria")
	@Positive(message = "La tarifa por dia debe ser mayor a cero")
	private double tarifaPorDia;

}
