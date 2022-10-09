package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
}
