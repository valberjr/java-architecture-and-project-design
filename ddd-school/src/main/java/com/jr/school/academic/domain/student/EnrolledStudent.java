package com.jr.school.academic.domain.student;

import com.jr.school.academic.domain.Event;

import java.time.LocalDateTime;

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

    public CPF getStudentCpf() {
        return studentCpf;
    }
}
