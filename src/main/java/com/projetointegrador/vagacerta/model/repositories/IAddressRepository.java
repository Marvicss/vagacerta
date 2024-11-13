package com.projetointegrador.vagacerta.model.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetointegrador.vagacerta.model.entities.Address;

public interface IAddressRepository extends JpaRepository<Address, UUID> {

}
