package com.jr.school.academic.domain.student;

import com.jr.school.shared.domain.event.Event;
import com.jr.school.shared.domain.event.Listener;

import java.time.format.DateTimeFormatter;

public class LogEnrolledStudent extends Listener {

    @Override
    protected void reactsTo(Event event) {
        var formattedMoment =
                event.moment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(
                String.format(
                        "Student with CPF %s enrolled at: %s",
                        ((EnrolledStudent) event).getStudentCpf(),
                        formattedMoment
                )
        );
    }

    @Override
    protected boolean shouldProcess(Event event) {
        return event instanceof EnrolledStudent;
    }
}
