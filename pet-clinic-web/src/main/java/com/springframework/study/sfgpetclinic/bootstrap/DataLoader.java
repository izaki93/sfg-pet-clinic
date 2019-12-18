package com.springframework.study.sfgpetclinic.bootstrap;

import com.springframework.study.sfgpetclinic.model.Owner;
import com.springframework.study.sfgpetclinic.model.Vet;
import com.springframework.study.sfgpetclinic.services.OwnerService;
import com.springframework.study.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ibrahim");
        owner1.setLastName("Mohsen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Joe");
        owner2.setLastName("Maximallian");

        ownerService.save(owner2);

        System.out.println("Load Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Tome");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Load Vets...");
    }
}
