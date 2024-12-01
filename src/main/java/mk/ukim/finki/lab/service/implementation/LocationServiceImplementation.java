package mk.ukim.finki.lab.service.implementation;

import mk.ukim.finki.lab.model.Location;
import mk.ukim.finki.lab.repository.LocationRepository;
import mk.ukim.finki.lab.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceImplementation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll().values().stream().toList();
    }
    @Override
    public Location findById(long locationId) {
        return locationRepository.findAll().get(locationId);
    }
}
