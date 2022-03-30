package com.jr.school.infra.sudent;

import com.jr.school.domain.student.CPF;
import com.jr.school.domain.student.Student;
import com.jr.school.domain.student.StudentNotFound;
import com.jr.school.domain.student.StudentRepository;

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
                .filter(s -> s.getCpf().equals(cpf.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> listAllEnrolledStudents() {
        return this.enrolled;
    }
}
