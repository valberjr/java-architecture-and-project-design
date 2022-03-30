package com.jr.school;

import com.jr.school.application.student.enroll.EnrollStudent;
import com.jr.school.application.student.enroll.EnrollStudentDto;
import com.jr.school.domain.EventPublisher;
import com.jr.school.domain.student.LogEnrolledStudent;
import com.jr.school.infra.sudent.InMemoryStudentRepository;

public class EnrollStudentByCommandLine {

    public static void main(String[] args) {
        var name = "Jess";
        var cpf = "123.456.789-00";
        var email = "jess@email.com";

        var publisher = new EventPublisher();
        publisher.add(new LogEnrolledStudent());

        var enroll = new EnrollStudent(new InMemoryStudentRepository(), publisher);
        enroll.execute(new EnrollStudentDto(name, cpf, email));
    }

}
