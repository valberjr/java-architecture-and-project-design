package com.jr.school.application.student.enroll;

import com.jr.school.domain.EventPublisher;
import com.jr.school.domain.student.CPF;
import com.jr.school.domain.student.LogEnrolledStudent;
import com.jr.school.infra.sudent.InMemoryStudentRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnrollStudentTest {

    @Test
    void studentShouldBePersisted() {
        var repository = new InMemoryStudentRepository();

        var publisher = new EventPublisher();
        publisher.add(new LogEnrolledStudent());

        var useCase = new EnrollStudent(repository, publisher);
        var data = new EnrollStudentDto(
                "Jessie",
                "123.456.789-00",
                "jessie@email.com"
        );

        useCase.execute(data);

        var found = repository.findByCPF(new CPF("123.456.789-00"));

        assertEquals("Jessie", found.getName());
        assertEquals("123.456.789-00", found.getCpf().toString());
        assertEquals("jessie@email.com", found.getEmail());
    }
}