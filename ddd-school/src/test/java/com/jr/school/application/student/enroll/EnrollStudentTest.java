package com.jr.school.application.student.enroll;

import com.jr.school.domain.student.CPF;
import com.jr.school.infra.sudent.InMemoryStudentRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnrollStudentTest {

    @Test
    void studentShouldBePersisted() {
        var repository = new InMemoryStudentRepository();
        var useCase = new EnrollStudent(repository);
        var data = new EnrollStudentDto(
                "Jessie",
                "123.456.789-00",
                "jessie@email.com"
        );

        useCase.execute(data);

        var found = repository.findByCPF(new CPF("123.456.789-00"));

        assertEquals("Jessie", found.getName());
        assertEquals("123.456.789-00", found.getCpf());
        assertEquals("jessie@email.com", found.getEmail());
    }
}