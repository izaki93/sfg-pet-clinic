package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
