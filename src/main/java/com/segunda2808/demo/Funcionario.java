package com.segunda2808.demo;

public class Funcionario extends Aluno {
    String funcao;
    int ctps;

    public Funcionario(int id, String nome, int cpf, Endereco endereco, int dataDeNascimento) {
        super(id, nome, cpf, endereco, dataDeNascimento);
        this.funcao = funcao;

    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

}
