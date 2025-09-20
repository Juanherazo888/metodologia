package com.API.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.hotel.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
