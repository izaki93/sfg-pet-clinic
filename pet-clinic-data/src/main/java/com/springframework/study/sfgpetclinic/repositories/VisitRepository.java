package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
