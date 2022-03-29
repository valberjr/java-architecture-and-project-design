package com.jr.rh.service.promocao;

import com.jr.rh.ValidacaoException;
import com.jr.rh.model.Cargo;
import com.jr.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        var cargoAtual = funcionario.getCargo();

        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if (metaBatida) {
            var novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta");
        }
    }

}
