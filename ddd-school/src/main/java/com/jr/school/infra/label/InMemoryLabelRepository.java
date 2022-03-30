package com.jr.school.infra.label;

import com.jr.school.domain.label.Label;
import com.jr.school.domain.label.LabelRepository;
import com.jr.school.domain.student.CPF;

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
