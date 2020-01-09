package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
