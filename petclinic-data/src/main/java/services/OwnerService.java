package services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastname(String lname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findall();
}
