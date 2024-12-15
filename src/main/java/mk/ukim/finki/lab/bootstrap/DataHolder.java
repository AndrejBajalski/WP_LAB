package mk.ukim.finki.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab.model.Event;
import mk.ukim.finki.lab.model.EventBooking;
import mk.ukim.finki.lab.model.Location;
import mk.ukim.finki.lab.repository.jpa.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataHolder {
    public static Map<Long, Event> events;
    public static List<EventBooking> eventBookings;

    private final LocationRepository locationRepository;

    public DataHolder(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @PostConstruct
    public void init() {
        events = new HashMap<>();
//        events.put(999L, new Event("Wadaiko-Sai", "Traditional Japanese Drums", 8.8, 999L));
        eventBookings = new ArrayList<>();
//        locationRepository.save(new Location(999L, "Skopje", "addr1", "2000",  "arena"));
//        locationRepository.save(new Location(999L, "Ohrid", "addr2", "3000",  "amfiteatar"));

    }

}
