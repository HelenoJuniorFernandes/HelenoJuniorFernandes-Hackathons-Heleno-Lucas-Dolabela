package com.hackathon.model;

import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new HashMap<>();
    }

    public void adicionarJurado(Jurado jurado, Integer nota) {
        this.jurados.put(jurado, nota);
    }

    @Override
    public void calcularNotaFinal() {
        if (jurados.isEmpty()) {
            projetoAvaliado.setNotaFinal(0);
            return;
        }
        int somaNotas = 0;
        for (Integer nota : jurados.values()) {
            somaNotas += nota;
        }
        projetoAvaliado.setNotaFinal(somaNotas / jurados.size());
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }
}


