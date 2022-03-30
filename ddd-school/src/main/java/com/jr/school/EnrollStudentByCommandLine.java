package com.jr.school;

import com.jr.school.academic.application.student.enroll.EnrollStudent;
import com.jr.school.academic.application.student.enroll.EnrollStudentDto;
import com.jr.school.academic.domain.student.LogEnrolledStudent;
import com.jr.school.academic.infra.sudent.InMemoryStudentRepository;
import com.jr.school.gamification.application.GenerateNewbieLabel;
import com.jr.school.gamification.infra.label.InMemoryLabelRepository;
import com.jr.school.shared.domain.event.EventPublisher;

public class EnrollStudentByCommandLine {

    public static void main(String[] args) {
        var name = "Jess";
        var cpf = "123.456.789-00";
        var email = "jess@email.com";

        var publisher = new EventPublisher();
        publisher.add(new LogEnrolledStudent());
        publisher.add(new GenerateNewbieLabel(new InMemoryLabelRepository()));

        var enroll = new EnrollStudent(new InMemoryStudentRepository(), publisher);
        enroll.execute(new EnrollStudentDto(name, cpf, email));
    }

}
