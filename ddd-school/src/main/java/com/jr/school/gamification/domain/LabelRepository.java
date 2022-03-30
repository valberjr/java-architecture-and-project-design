package com.jr.school.gamification.domain;

import com.jr.school.shared.domain.CPF;

import java.util.List;

public interface LabelRepository {

    void add(Label label);

    List<Label> studentLabels(CPF cpf);
}
