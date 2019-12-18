package com.springframework.study.sfgpetclinic.services.map;


import com.springframework.study.sfgpetclinic.model.Vet;
import com.springframework.study.sfgpetclinic.services.CrudService;
import com.springframework.study.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
