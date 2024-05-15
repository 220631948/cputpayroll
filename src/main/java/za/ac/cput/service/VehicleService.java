package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleService implements IVehicleService{
   private VehicleRepository vehicleRepository;

   @Autowired
   VehicleService (VehicleRepository vehicleRepository){
       this.vehicleRepository = vehicleRepository;
   }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle read(Long vehicleId) {
        return vehicleRepository.findById(vehicleId).orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }



}
