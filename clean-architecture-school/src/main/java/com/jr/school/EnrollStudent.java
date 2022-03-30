package com.jr.school;

import com.jr.school.domain.student.CPF;
import com.jr.school.domain.student.Email;
import com.jr.school.domain.student.Student;
import com.jr.school.infra.sudent.InMemoryStudentRepository;

public class EnrollStudent {
    public static void main(String[] args) {
        var name = "Jess";
        var cpf = new CPF("123.456.789-00");
        var email = new Email("jess@email.com");
        var student = new Student(cpf, name, email);

        var repository = new InMemoryStudentRepository();
        repository.enroll(student);
    }
}
