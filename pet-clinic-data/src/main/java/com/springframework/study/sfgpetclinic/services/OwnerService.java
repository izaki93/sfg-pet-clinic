package com.springframework.study.sfgpetclinic.services;

import com.springframework.study.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
