package com.API.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.hotel.model.Reserva;
import com.API.hotel.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}