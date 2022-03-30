package com.jr.school.domain.label;

import com.jr.school.domain.student.CPF;

public class Label {

    private CPF studentCpf;
    private String name;

    public Label(CPF studentCpf, String name) {
        this.studentCpf = studentCpf;
        this.name = name;
    }

    public CPF getStudentCpf() {
        return studentCpf;
    }

    public String getName() {
        return name;
    }

}
