package com.jr.school.gamification.infra.label;

import com.jr.school.gamification.domain.Label;
import com.jr.school.gamification.domain.LabelRepository;
import com.jr.school.academic.domain.student.CPF;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryLabelRepository implements LabelRepository {

    private List<Label> labels = new ArrayList<>();

    @Override
    public void add(Label label) {
        this.labels.add(label);
    }

    @Override
    public List<Label> studentLabels(CPF cpf) {
        return this.labels.stream()
                .filter(l -> l.getStudentCpf().equals(cpf))
                .collect(Collectors.toList());
    }
}
