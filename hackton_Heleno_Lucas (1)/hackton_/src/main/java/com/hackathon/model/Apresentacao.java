package com.hackathon.model;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Banca banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Banca banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public void realizarApresentacao() {
        System.out.println("Apresentação do projeto " + projeto.obterNome() + " na sala " + local.obterNome() + " em " + dataHora);
        banca.calcularNotaFinal();
        System.out.println("Nota final do projeto " + projeto.obterNome() + ": " + projeto.getNotaFinal());
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Banca getBanca() {
        return banca;
    }

    public Sala getLocal() {
        return local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}


