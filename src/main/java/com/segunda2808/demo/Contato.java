package com.segunda2808.demo;

public class Contato {
    int telefoneFixo;
    int telefoneCelular;
    int whatsapp;
    String email;
    String instagram;
    Pessoa ContatoEmergencia;

    //CONTRUTOR PARA O ALUNO
        public Contato(int telefoneFixo, int telefoneCelular, int whatsapp, String email, String instagram) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.whatsapp = whatsapp;
        this.email = email;
        this.instagram = instagram;
    }

    //CONSTRUTOR FUNCIONARIO
    public Contato(int telefoneFixo, int telefoneCelular, int whatsapp, String email, Pessoa contatoEmergencia) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.whatsapp = whatsapp;
        this.email = email;
        ContatoEmergencia = contatoEmergencia;
    }

    public int getTelefoneFixo() {
        return telefoneFixo;
    }
    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public int getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public int getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Pessoa getContatoEmergencia() {
        return ContatoEmergencia;
    }
    public void setContatoEmergencia(Pessoa contatoEmergencia) {
        ContatoEmergencia = contatoEmergencia;
    }
}
