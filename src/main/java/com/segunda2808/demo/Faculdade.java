package com.segunda2808.demo;

public class Faculdade {
    int id;
    String razaoSocial;
    String cnpj;
    String endereco;
    
    public Faculdade(int id, String razaoSocial, String cnpj, String endereco) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Faculdade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;

    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    
    }
    public static String validaRazaoSocial( String razaoSocial) {
        return razaoSocial;

    }
    // Método para exibir informações da universidade
}
