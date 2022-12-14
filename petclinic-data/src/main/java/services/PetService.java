package services;

import petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet save);
    Set<Pet> findAll();
}
