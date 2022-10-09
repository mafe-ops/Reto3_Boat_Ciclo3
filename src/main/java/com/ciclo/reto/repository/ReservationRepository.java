package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.ReservationInterface;
import com.ciclo.reto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationInterface extencionesCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) extencionesCrud.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return extencionesCrud.findById(id);
    }

    public Reservation save(Reservation reservation){
        return extencionesCrud.save(reservation);
    }
}
