package com.springframework.study.sfgpetclinic.bootstrap;

import com.springframework.study.sfgpetclinic.model.Owner;
import com.springframework.study.sfgpetclinic.model.Pet;
import com.springframework.study.sfgpetclinic.model.PetType;
import com.springframework.study.sfgpetclinic.model.Vet;
import com.springframework.study.sfgpetclinic.services.OwnerService;
import com.springframework.study.sfgpetclinic.services.PetTypeService;
import com.springframework.study.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ibrahim");
        owner1.setLastName("Mohsen");
        owner1.setAddress("26 Makram");
        owner1.setCity("Naser City");
        owner1.setTelephone("541518415");

        Pet ibrahimsPet = new Pet();
        ibrahimsPet.setPetType(savedDogPetType);
        ibrahimsPet.setOwner(owner1);
        ibrahimsPet.setBirthDate(LocalDate.now());
        ibrahimsPet.setName("Rosco");
        owner1.getPets().add(ibrahimsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Joe");
        owner2.setLastName("Maximallian");
        owner2.setAddress("21 Moksi St");
        owner2.setCity("NewYork");
        owner2.setTelephone("585888415");

        Pet joesPet = new Pet();
        joesPet.setPetType(savedCatPetType);
        joesPet.setOwner(owner2);
        joesPet.setBirthDate(LocalDate.now());
        joesPet.setName("Just Cat");
        owner2.getPets().add(joesPet);

        ownerService.save(owner2);

        System.out.println("Load Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Tome");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Load Vets...");
    }
}
