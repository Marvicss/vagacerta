package com.projetointegrador.vagacerta.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.vagacerta.model.entities.Recruiter;

public interface IRecruinterRepository extends JpaRepository<Recruiter, Long> {

    List<Recruiter> findAll();

    Recruiter findById(String id);

    void create(Recruiter recruiter);

    void update(Recruiter recruiter);

    void delete(String id);

}