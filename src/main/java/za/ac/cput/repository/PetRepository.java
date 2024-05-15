package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, String> {
}
