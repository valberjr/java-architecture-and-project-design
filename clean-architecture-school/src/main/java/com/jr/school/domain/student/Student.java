package com.jr.school.domain.student;

import java.util.ArrayList;
import java.util.List;

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
        this.phones.add(new Phone(areaCode, number));
    }

    public String getCpf() {
        return cpf.getNumber();
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
