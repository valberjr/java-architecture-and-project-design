package com.jr.school.academic.domain.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentTest {

    private Student student;

    @BeforeEach
    void beforeEach() {
        student = new Student(
                new CPF("123.456.789-00"),
                "Jessie",
                new Email("jessie@email.com")
        );
    }

    @Test
    void shouldAllowAdd1PhoneNumber() {
        this.student.addPhone("11", "123456789");
        assertEquals(1, this.student.getPhones().size());
    }

    @Test
    void shouldAllowAdd2PhoneNumbers() {
        this.student.addPhone("11", "123456789");
        this.student.addPhone("11", "123456789");
        assertEquals(2, this.student.getPhones().size());
    }

    @Test
    void shouldNotAllowAdd3PhoneNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.student.addPhone("11", "123456789");
            this.student.addPhone("11", "123456789");
            this.student.addPhone("11", "123456789");
        });
    }
}