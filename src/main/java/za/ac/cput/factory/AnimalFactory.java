package za.ac.cput.factory;

import za.ac.cput.domain.Animal;
import za.ac.cput.util.Helper;

public class AnimalFactory {
    public static Animal buildAnimal (long animalId, String species){
        if(Helper.isNullorEmpty(species) ||
           animalId <= 0)
            return null;

        return new Animal(animalId, species);
    }

}
