package com.example.pets.newpets;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pets> getAllPets() {
        return petRepository.findAll();
    }

    public Pets getPetById(Long id) {
        return petRepository.findPetsById(id);
    }

    public Pets addNewPet(Pets pets) {
        return petRepository.save(pets);
    }

    public Pets updatePet(Pets pets) {
        return petRepository.save(pets);
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }
}
