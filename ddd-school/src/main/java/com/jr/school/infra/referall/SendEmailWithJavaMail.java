package com.jr.school.infra.referall;

import com.jr.school.application.SendEmail;
import com.jr.school.domain.student.Student;

public class SendEmailWithJavaMail implements SendEmail {

    @Override
    public void sendTo(Student student) {
        // send email logic
    }
}
