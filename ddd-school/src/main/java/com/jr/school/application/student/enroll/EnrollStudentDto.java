package com.jr.school.application.student.enroll;

import com.jr.school.domain.student.CPF;
import com.jr.school.domain.student.Email;
import com.jr.school.domain.student.Student;

public class EnrollStudentDto {

    private String studentName;
    private String studentCpf;
    private String studentEmail;

    public EnrollStudentDto(String studentName, String studentCpf, String studentEmail) {
        this.studentName = studentName;
        this.studentCpf = studentCpf;
        this.studentEmail = studentEmail;
    }

    public Student create() {
        return new Student(
                new CPF(studentCpf),
                studentName,
                new Email(studentEmail)
        );
    }
}
