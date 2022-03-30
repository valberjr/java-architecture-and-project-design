package com.jr.school.academic.infra.referall;

import com.jr.school.academic.application.SendEmail;
import com.jr.school.academic.domain.student.Student;

public class SendEmailWithJavaMail implements SendEmail {

    @Override
    public void sendTo(Student student) {
        // send email logic
    }
}
