package api.carreras.events.infrastructure.persistence.postgresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import api.carreras.events.domain.Event;
import api.carreras.events.infrastructure.DomainPersistence;

@Component
public class EventReposirotyImpl implements DomainPersistence {

    @Autowired
    private EventRepository eventRepository;
    
    @Override
    public List<Event> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Event findById(Long eventId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Event findByLocation(String eventLocation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Event save(Event event) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Event event) throws Exception {
        // TODO Auto-generated method stub

    }

}
