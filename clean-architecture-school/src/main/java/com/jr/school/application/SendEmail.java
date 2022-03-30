package com.jr.school.application;

import com.jr.school.domain.student.Student;

public interface SendEmail {

    void sendTo(Student student);
}
