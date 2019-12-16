package com.springframework.study.sfgpetclinic.services;

import com.springframework.study.sfgpetclinic.model.Pet;
import com.springframework.study.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
