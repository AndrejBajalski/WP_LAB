package mk.ukim.finki.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab.model.Event;
import mk.ukim.finki.lab.model.EventBooking;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataHolder {
    public static Map<Long, Event> events;
    public static List<EventBooking> eventBookings;

    @PostConstruct
    public void init() {
        events = new HashMap<>();
        events.put(999L, new Event("Wadaiko-Sai", "Traditional Japanese Drums", 8.8, 999L, 1004L));
        eventBookings = new ArrayList<>();
    }

}
