package com.springframework.study.sfgpetclinic.services.map;

import com.springframework.study.sfgpetclinic.model.Visit;
import com.springframework.study.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null ||
                visit.getPet().getOwner().getId() == null) {
            throw new  RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findByID(Long id) {
        return null;
    }
}
