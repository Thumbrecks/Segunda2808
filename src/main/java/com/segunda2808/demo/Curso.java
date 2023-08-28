package com.segunda2808.demo;

import org.yaml.snakeyaml.events.Event.ID;

public class Curso {
    int id;
    String nome;
    String discricaoDoCurso;
    int duracaoDoCurso;
    int cargaHoraria;
    String preRiquisitos;
    String objetivoAprendizagem;
    String estruturaDoCurso;
    String professores;
    String instrutores;
    int avaliacao;
    String recursos;
    String materias;
    String metodologia;
    String oportunidadesDeCarreira;
    String estagio;
    String raticas;
    String certificado;
    String requisitosGraduacao;
    int custos;
    int taxas;

    
    public Curso(int id, String nome, String discricaoDoCurso, int duracaoDoCurso, int cargaHoraria,
            String preRiquisitos, String objetivoAprendizagem, String estruturaDoCurso, String professores,
            String instrutores, int avaliacao, String recursos, String materias, String metodologia,
            String oportunidadesDeCarreira, String estagio, String raticas, String certificado,
            String requisitosGraduacao, int custos, int taxas) {
                
        this.id = id;
        this.nome = nome;
        this.discricaoDoCurso = discricaoDoCurso;
        this.duracaoDoCurso = duracaoDoCurso;
        this.cargaHoraria = cargaHoraria;
        this.preRiquisitos = preRiquisitos;
        this.objetivoAprendizagem = objetivoAprendizagem;
        this.estruturaDoCurso = estruturaDoCurso;
        this.professores = professores;
        this.instrutores = instrutores;
        this.avaliacao = avaliacao;
        this.recursos = recursos;
        this.materias = materias;
        this.metodologia = metodologia;
        this.oportunidadesDeCarreira = oportunidadesDeCarreira;
        this.estagio = estagio;
        this.raticas = raticas;
        this.certificado = certificado;
        this.requisitosGraduacao = requisitosGraduacao;
        this.custos = custos;
        this.taxas = taxas;
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
    public String getDiscricaoDoCurso() {
        return discricaoDoCurso;
    }
    public void setDiscricaoDoCurso(String discricaoDoCurso) {
        this.discricaoDoCurso = discricaoDoCurso;
    }
    public int getDuracaoDoCurso() {
        return duracaoDoCurso;
    }
    public void setDuracaoDoCurso(int duracaoDoCurso) {
        this.duracaoDoCurso = duracaoDoCurso;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getPreRiquisitos() {
        return preRiquisitos;
    }
    public void setPreRiquisitos(String preRiquisitos) {
        this.preRiquisitos = preRiquisitos;
    }
    public String getObjetivoAprendizagem() {
        return objetivoAprendizagem;
    }
    public void setObjetivoAprendizagem(String objetivoAprendizagem) {
        this.objetivoAprendizagem = objetivoAprendizagem;
    }
    public String getEstruturaDoCurso() {
        return estruturaDoCurso;
    }
    public void setEstruturaDoCurso(String estruturaDoCurso) {
        this.estruturaDoCurso = estruturaDoCurso;
    }
    public String getProfessores() {
        return professores;
    }
    public void setProfessores(String professores) {
        this.professores = professores;
    }
    public String getInstrutores() {
        return instrutores;
    }
    public void setInstrutores(String instrutores) {
        this.instrutores = instrutores;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public String getRecursos() {
        return recursos;
    }
    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }
    public String getMaterias() {
        return materias;
    }
    public void setMaterias(String materias) {
        this.materias = materias;
    }
    public String getMetodologia() {
        return metodologia;
    }
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    public String getOportunidadesDeCarreira() {
        return oportunidadesDeCarreira;
    }
    public void setOportunidadesDeCarreira(String oportunidadesDeCarreira) {
        this.oportunidadesDeCarreira = oportunidadesDeCarreira;
    }
    public String getEstagio() {
        return estagio;
    }
    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }
    public String getRaticas() {
        return raticas;
    }
    public void setRaticas(String raticas) {
        this.raticas = raticas;
    }
    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
    public String getRequisitosGraduacao() {
        return requisitosGraduacao;
    }
    public void setRequisitosGraduacao(String requisitosGraduacao) {
        this.requisitosGraduacao = requisitosGraduacao;
    }
    public int getCustos() {
        return custos;
    }
    public void setCustos(int custos) {
        this.custos = custos;
    }
    public int getTaxas() {
        return taxas;
    }
    public void setTaxas(int taxas) {
        this.taxas = taxas;
    }



}
