package com.projetointegrador.vagacerta.model.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetointegrador.vagacerta.model.entities.Apprentice;

public interface IApprenticeRepository extends JpaRepository<Apprentice, UUID> {
}
