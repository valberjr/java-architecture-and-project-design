package com.jr.school.academic.application;

import com.jr.school.academic.domain.student.Student;

public interface SendEmail {

    void sendTo(Student student);
}
