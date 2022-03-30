package com.jr.school.domain.student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByCPF(CPF cpf);

    List<Student> listAllEnrolledStudents();
}
