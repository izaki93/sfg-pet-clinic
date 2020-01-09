package com.springframework.study.sfgpetclinic.repositories;

import com.springframework.study.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
