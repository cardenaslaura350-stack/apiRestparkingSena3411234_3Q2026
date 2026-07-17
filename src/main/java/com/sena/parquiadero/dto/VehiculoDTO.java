package com.sena.parquiadero.dto;

import com.sena.parquiadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class VehiculoDTO {

	private long idVehiculo;
	@NotBlank(message = "la placa es obligatoria")
	@Pattern(regexp = "^[A-Za-z0-9 -]{3,10}$", message = "Formato de placa onvalido")
	private String placa;
	@NotNull(message = "El tipo de vehiculo es oblicatorio")
	private TipoVehiculo tipo;
	private String marca;
	private String modele;

}
