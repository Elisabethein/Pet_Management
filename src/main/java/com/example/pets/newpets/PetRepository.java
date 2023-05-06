package com.example.pets.newpets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pets, Long> {
    void deleteById(Long id);
    Pets findPetsById(Long id);
}
