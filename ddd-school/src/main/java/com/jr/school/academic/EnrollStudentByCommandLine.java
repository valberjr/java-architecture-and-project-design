package com.jr.school.academic;

import com.jr.school.academic.domain.EventPublisher;
import com.jr.school.academic.domain.student.LogEnrolledStudent;
import com.jr.school.academic.application.student.enroll.EnrollStudent;
import com.jr.school.academic.application.student.enroll.EnrollStudentDto;
import com.jr.school.academic.infra.sudent.InMemoryStudentRepository;

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
