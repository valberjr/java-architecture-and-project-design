package com.jr.school.gamification.application;

import com.jr.school.gamification.domain.Label;
import com.jr.school.gamification.domain.LabelRepository;
import com.jr.school.shared.domain.CPF;
import com.jr.school.shared.domain.event.Event;
import com.jr.school.shared.domain.event.EventType;
import com.jr.school.shared.domain.event.Listener;

public class GenerateNewbieLabel extends Listener {

    private final LabelRepository labelRepository;

    public GenerateNewbieLabel(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    protected void reactsTo(Event event) {
        var studentCpf = (CPF) event.informations().get("cpf");
        var newbie = new Label(studentCpf, "Newbie");
        labelRepository.add(newbie);
    }

    @Override
    protected boolean shouldProcess(Event event) {
        return event.type() == EventType.ENROLLED_STUDENT;
    }
}
