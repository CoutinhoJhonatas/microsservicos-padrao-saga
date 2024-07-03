package br.com.microservices.choreography.orderservice.core.controller;

import br.com.microservices.choreography.orderservice.core.dto.EventFilters;
import br.com.microservices.choreography.orderservice.core.service.EventService;
import br.com.microservices.choreography.orderservice.core.document.Event;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/event")
public class EventController {

    private EventService eventService;

    @GetMapping
    public Event findByFilters(EventFilters filters) {
        return eventService.findByFIlters(filters);
    }

    @GetMapping("/all")
    public List<Event> findAll() {
        return eventService.findAll();
    }

}
