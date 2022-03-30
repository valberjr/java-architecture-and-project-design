package com.jr.school;

import com.jr.school.application.student.enroll.EnrollStudent;
import com.jr.school.application.student.enroll.EnrollStudentDto;
import com.jr.school.infra.sudent.InMemoryStudentRepository;

public class EnrollStudentByCommandLine {

    public static void main(String[] args) {
        var name = "Jess";
        var cpf = "123.456.789-00";
        var email = "jess@email.com";

        var enroll = new EnrollStudent(new InMemoryStudentRepository());
        enroll.execute(new EnrollStudentDto(name, cpf, email));
    }

}
