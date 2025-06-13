package com.hackathon.model;

public class Projeto implements Avaliavel {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    private String nome;

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
        this.equipe.setProjeto(this);
    }

    public void adicionarOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public void adicionarEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String obterNome() {
        return nome;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public void calcularNotaFinal() {
    }
}


