package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
