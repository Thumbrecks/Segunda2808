package com.segunda2808.demo;

public class Aluno {
    int id;
    String nome;
    int cpf;
    Endereco endereco;
    int dataDeNascimento;
    Contato contato;

    // CONSTRUTOR DE ALUNO E FUNCIONARIO
        public Aluno(int id, String nome, int cpf, Endereco endereco, int dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        
    }

    // CONTRUTOR DE CONTATO DE EMERGENCIA DE FUNCIONARIO
        public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getAtaDeNascimento() {
        return dataDeNascimento;
    }
    public void setAtaDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
