package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Pet;
import za.ac.cput.repository.PetRepository;

@Service
public class PetService {
    PetRepository petRepository;

    @Autowired
    PetService (PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public Pet create (Pet pet){
        return petRepository.save(pet);
    }
}
