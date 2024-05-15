package za.ac.cput.factory;

import za.ac.cput.domain.Pet;
import za.ac.cput.util.Helper;

public class PetFactory {
    public static Pet buildPet (long animalId, String species, String name){
        if (Helper.isNullorEmpty(species) ||
            Helper.isNullorEmpty(name)||
            animalId <= 0)
            return null;

        return new Pet(animalId, species, name);

    }
}
