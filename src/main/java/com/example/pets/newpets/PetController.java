package com.example.pets.newpets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/pets")
public class PetController {
    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Pets>> getAllPets(){
        List<Pets> pets=petService.getAllPets();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }
    @GetMapping(path="/find/{id}")
    public ResponseEntity<Pets> getPetByCode(@PathVariable("id") Long id){
        Pets pets =petService.getPetById(id);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Pets> registerNewPet(@RequestBody Pets pets){
        Pets newPets =petService.addNewPet(pets);
        return new ResponseEntity<>(newPets, HttpStatus.CREATED);
    }
    @PutMapping(path="/update")
    public ResponseEntity<Pets> updatePet(@RequestBody Pets pets) {
        Pets newPets =petService.updatePet(pets);
        return new ResponseEntity<>(newPets, HttpStatus.OK);
    }
    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<?> deletePet(@PathVariable("id") Long id){
        petService.deletePet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
