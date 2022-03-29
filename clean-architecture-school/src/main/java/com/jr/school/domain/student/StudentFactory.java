package com.jr.school.domain.student;

// it's not an application of factory method
public class StudentFactory {

    private Student student;

    public StudentFactory withNameCPFAndEmail(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentFactory withPhone(String areaCode, String number) {
        this.student.addPhone(areaCode, number);
        return this;
    }

    public Student create() {
        return this.student;
    }

}
