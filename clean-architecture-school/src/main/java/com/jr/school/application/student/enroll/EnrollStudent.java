package com.jr.school.application.student.enroll;

import com.jr.school.domain.student.StudentRepository;

public class EnrollStudent {

    private final StudentRepository repository;

    public EnrollStudent(StudentRepository repository) {
        this.repository = repository;
    }

    // COMMAND
    public void execute(EnrollStudentDto data) {
        var student = data.create();
        repository.enroll(student);
    }
}
