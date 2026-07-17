package com.sena.parquiadero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import com.sena.parquiadero.model.Vehiculo;

import jakarta.persistence.LockModeType;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {

	Optional<Vehiculo> findByplaca(String placa);

	boolean existsByplaca(String placa);

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("SELECT v FROM Vehiculo v WHERE v.placa = : placa")
	Optional<Vehiculo> findByForUpdate(String placa);

}
