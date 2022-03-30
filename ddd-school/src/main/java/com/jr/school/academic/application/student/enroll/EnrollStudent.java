package com.jr.school.academic.application.student.enroll;

import com.jr.school.shared.domain.event.EventPublisher;
import com.jr.school.academic.domain.student.EnrolledStudent;
import com.jr.school.academic.domain.student.StudentRepository;

public class EnrollStudent {

    private final StudentRepository repository;
    private final EventPublisher publisher;

    public EnrollStudent(StudentRepository repository, EventPublisher publisher) {
        this.repository = repository;
        this.publisher = publisher;
    }

    // COMMAND
    public void execute(EnrollStudentDto data) {
        var student = data.create();
        repository.enroll(student);

        var event = new EnrolledStudent(student.getCpf());
        publisher.publish(event);
    }
}
