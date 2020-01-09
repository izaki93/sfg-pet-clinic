package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
