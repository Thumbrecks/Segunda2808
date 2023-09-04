package com.segunda2808.demo;

import java.util.ArrayList;
import java.util.List;
import com.segunda2808.demo.enums.UnidadeFederal;

public class Aluno {
    private int id;
    private static int contador = -1;
    private String nome;
    private int cpf;
    private String endereco;
    private int dataDeNascimento;
    private String curso;
    private String uf;
    private static List<Aluno> listaAlunos = new ArrayList<>();

    public Aluno() {
        this.id = ++contador;
    }
    // Construtor de Aluno
    public Aluno(String nome, int cpf, String endereco, int dataDeNascimento, String curso, String uf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.curso = curso;
        this.uf = uf;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
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
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public int getDataDeNascimento() {
    return dataDeNascimento;
}
public void setDataDeNascimento(int dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
}
public String getCurso() {
    return curso;
}
public void setCurso(String curso) {
    this.curso = curso;
}

public String getUf() {
    return uf;
}

public void setUf(String uf) {
    this.uf = uf;
}

public void CadastroAluno() {
    listaAlunos = new ArrayList<>();
}


    // Método para adicionar um aluno à lista
    public void cadastrarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    // Método para exibir a lista de alunos cadastrados
    public static void listarAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println("Id: " + aluno.getId());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Endereço: " + aluno.getEndereco());
            System.out.println("Data de Nascimento: " + aluno.getDataDeNascimento());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("UF: " + aluno.getUf());
            System.out.println();
        }
    }
}