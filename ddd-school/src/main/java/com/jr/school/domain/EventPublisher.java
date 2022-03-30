package com.jr.school.domain;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher {

    private List<Listener> listeners = new ArrayList<>();

    public void add(Listener listener) {
        this.listeners.add(listener);
    }

    public void publish(Event event) {
        this.listeners.forEach(l -> {
            l.process(event);
        });
    }

}
