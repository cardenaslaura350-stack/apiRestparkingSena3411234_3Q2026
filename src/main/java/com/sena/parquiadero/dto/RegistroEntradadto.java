package com.sena.parquiadero.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistroEntradadto {

	@NotBlank(message = "la placa es obligatoria")
	private String placa;

}
