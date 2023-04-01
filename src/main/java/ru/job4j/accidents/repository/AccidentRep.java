package ru.job4j.accidents.repository;


import ru.job4j.accidents.model.Accident;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AccidentRep {

    Optional<Accident> create(Accident accident);

    boolean update(Accident accident);
    boolean delete(int id);

    Collection<Accident> findAll();

    Optional<Accident> findById(int id);

}
