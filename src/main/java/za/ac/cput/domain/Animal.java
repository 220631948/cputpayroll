package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    private long animalId;
    private String species;

    public Animal() {}

    public Animal(long animalId, String species) {
        this.animalId = animalId;
        this.species = species;
    }

    public long getAnimalId() {
        return animalId;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalId == animal.animalId && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalId, species);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", species='" + species + '\'' +
                '}';
    }
}
