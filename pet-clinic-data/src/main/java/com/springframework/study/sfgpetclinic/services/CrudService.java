package com.springframework.study.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
