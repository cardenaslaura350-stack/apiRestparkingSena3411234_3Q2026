package com.sena.parquiadero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parquiadero.model.Registro;
import com.sena.parquiadero.model.TipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registro, Long> {

	Optional<Registro> findByVehiculoPlacasAndActivoTrue(String placa);

	List<Registro> findByActivoTrue();

	boolean existsByVehiculoIdVehiculo(long VehiculoId);

	boolean existsByVehiculoTipo(TipoVehiculo tipoVehiculo);

}
