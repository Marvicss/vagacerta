package com.projetointegrador.vagacerta.model.repositories;

import com.projetointegrador.vagacerta.model.entities.Vacancy;

import java.util.ArrayList;
import java.util.UUID;

public interface IVacancyRepository {

    void save(Vacancy vacancy);

    ArrayList<Vacancy> findAll();

    Vacancy findById(UUID id);

    void deleteById(UUID id);
}
