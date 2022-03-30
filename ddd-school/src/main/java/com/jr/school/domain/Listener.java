package com.jr.school.domain;

public abstract class Listener {

    public void process(Event event) {
        if (this.shouldProcess(event)) {
            this.reactsTo(event);
        }
    }

    protected abstract void reactsTo(Event event);

    protected abstract boolean shouldProcess(Event event);
}
