package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Racer;

import java.util.List;

@Repository
public interface RacerRepository extends JpaRepository <Racer, Name> {
    List <Racer> findAllByRacerNumberGreaterThan (int number);

}
