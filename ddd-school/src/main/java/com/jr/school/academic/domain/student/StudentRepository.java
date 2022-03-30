package com.jr.school.academic.domain.student;

import com.jr.school.shared.domain.CPF;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByCPF(CPF cpf);

    List<Student> listAllEnrolledStudents();
}
