package com.jr.school.academic.application.student.enroll;

import com.jr.school.shared.domain.CPF;
import com.jr.school.academic.domain.student.Student;
import com.jr.school.academic.domain.student.Email;

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
