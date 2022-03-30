package com.jr.school.academic.infra.sudent;

import com.jr.school.academic.domain.student.Student;
import com.jr.school.academic.domain.student.StudentNotFound;
import com.jr.school.academic.domain.student.StudentRepository;
import com.jr.school.academic.domain.student.CPF;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {

    private List<Student> enrolled = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.enrolled.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.enrolled.stream()
                .filter(s -> s.getCpf().getNumber().equals(cpf.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> listAllEnrolledStudents() {
        return this.enrolled;
    }
}
