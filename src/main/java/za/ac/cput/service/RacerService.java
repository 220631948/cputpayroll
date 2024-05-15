package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Racer;
import za.ac.cput.repository.RacerRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RacerService implements IService<Racer, Name>{

    private final RacerRepository repository;

    @Autowired
    RacerService (RacerRepository repository){
        this.repository = repository;
    }

    @Override
    public Racer create(Racer racer) {
        return repository.save(racer);
    }

    @Override
    public Racer read(Name name) {
        return repository.findById(name).orElse(null);
    }

    @Override
    public Racer update(Racer racer) {
        return repository.save(racer);
    }

    public List<Racer> winsMoreThan (int number){
        return repository.findAllByRacerNumberGreaterThan(number);
    }


}
