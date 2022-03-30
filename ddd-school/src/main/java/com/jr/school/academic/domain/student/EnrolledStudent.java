package com.jr.school.academic.domain.student;

import com.jr.school.shared.domain.CPF;
import com.jr.school.shared.domain.event.Event;
import com.jr.school.shared.domain.event.EventType;

import java.time.LocalDateTime;
import java.util.Map;

public class EnrolledStudent implements Event {

    private final CPF studentCpf;
    private final LocalDateTime moment;

    public EnrolledStudent(CPF studentCpf) {
        this.studentCpf = studentCpf;
        this.moment = LocalDateTime.now();
    }

    @Override
    public LocalDateTime moment() {
        return this.moment;
    }

    @Override
    public EventType type() {
        return EventType.ENROLLED_STUDENT;
    }

    @Override
    public Map<String, Object> informations() {
        return Map.of("cpf", studentCpf);
    }

    public CPF getStudentCpf() {
        return studentCpf;
    }
}
