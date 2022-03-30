package com.jr.school.academic.domain.student;

import com.jr.school.shared.domain.CPF;

import java.io.Serial;

public class StudentNotFound extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public StudentNotFound(CPF cpf) {
        super("Student not found with cpf: " + cpf.getNumber());
    }
}
