package com.jr.school.domain.student;

import java.io.Serial;

public class StudentNotFound extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public StudentNotFound(CPF cpf) {
        super("Student not found with cpf: " + cpf.getNumber());
    }
}
