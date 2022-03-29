package com.jr.school.domain.referall;

import com.jr.school.domain.student.Student;

import java.time.LocalDateTime;

public class Referall {

    private Student referred;
    private Student indicator;
    private LocalDateTime referallDate;

    public Referall(Student referred, Student indicator) {
        this.referred = referred;
        this.indicator = indicator;
        this.referallDate = LocalDateTime.now();
    }

    public Student getReferred() {
        return referred;
    }

    public Student getIndicator() {
        return indicator;
    }

    public LocalDateTime getReferallDate() {
        return referallDate;
    }
}
