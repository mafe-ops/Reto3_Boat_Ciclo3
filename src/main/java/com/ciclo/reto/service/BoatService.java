package com.ciclo.reto.service;

import com.ciclo.reto.modelo.Boat;
import com.ciclo.reto.repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepository;

    public List<Boat> getAll() {
        return boatRepository.getAll();
    }

    public Optional<Boat> getBoat(int id) {
        return boatRepository.getBoat(id);
    }

    public Boat save(Boat boat) {
        if (boat.getId() == null) {
            return boatRepository.save(boat);
        } else {
            Optional<Boat>boat1 = boatRepository.getBoat(boat.getId());
            if (boat1.isEmpty()) {
                return boatRepository.save(boat);
            } else {
                return boat;
            }
        }
    }
}