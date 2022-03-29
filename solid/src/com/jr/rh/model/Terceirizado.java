package com.jr.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = getEmpresa();
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNome() {
        return this.dadosPessoais.getNome();
    }

    public String getCpf() {
        return this.dadosPessoais.getCpf();
    }

    public Cargo getCargo() {
        return this.dadosPessoais.getCargo();
    }

    public BigDecimal getSalario() {
        return this.dadosPessoais.getSalario();
    }
}
