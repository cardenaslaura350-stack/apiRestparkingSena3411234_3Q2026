package com.sena.parquiadero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parquiadero.model.Tarifa;
import com.sena.parquiadero.model.TipoVehiculo;

public interface ITarifaRepository extends JpaRepository<Tarifa, Long> {

	Optional<Tarifa> findyTipovehiculo(TipoVehiculo tipoVehiculo);

}
