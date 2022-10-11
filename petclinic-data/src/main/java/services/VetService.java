package services;

import petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet save);
    Set<Vet> findAll();
}
