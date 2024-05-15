package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Animal;
import za.ac.cput.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService implements IAnimalService{
    private AnimalRepository animalRepository;

    @Autowired
    AnimalService (AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    @Override
    public Animal create(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal read(Long animalId) {
        return animalRepository.findById(String.valueOf(animalId)).orElse(null);
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

}
