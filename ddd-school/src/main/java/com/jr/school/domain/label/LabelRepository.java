package com.jr.school.domain.label;

import com.jr.school.domain.student.CPF;

import java.util.List;

public interface LabelRepository {

    void add(Label label);

    List<Label> studentLabels(CPF cpf);
}
