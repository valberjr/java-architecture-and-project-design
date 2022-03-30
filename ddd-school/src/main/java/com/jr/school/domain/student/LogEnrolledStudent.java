package com.jr.school.domain.student;

import java.time.format.DateTimeFormatter;

public class LogEnrolledStudent {

    public void reactsTo(EnrolledStudent event) {
        var formattedMoment =
                event.moment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(
                String.format(
                        "Student with CPF %s enrolled at: %s",
                        event.getStudentCpf(),
                        formattedMoment
                )
        );
    }
}
