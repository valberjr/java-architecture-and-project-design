package com.jr.school.academic.domain.student;

import com.jr.school.shared.domain.CPF;

import java.util.ArrayList;
import java.util.List;

// AGGREGATE ROOT
public class Student {

    private CPF cpf;
    private String name;

    private Email email;

    private List<Phone> phones = new ArrayList<>();

    private String password;

    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String areaCode, String number) {
        if (phones.size() == 2) {
            throw new IllegalArgumentException("Maximum number of phones reached");
        }
        this.phones.add(new Phone(areaCode, number));
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAddress();
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
