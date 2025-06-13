package com.hackathon.collection;

import com.hackathon.model.Apresentacao;
import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes;

    private Apresentacoes() {
        apresentacoes = new ArrayList<>();
    }

    public static synchronized Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    public Apresentacao pesquisarApresentacao(String nomeProjeto) {
        for (Apresentacao apresentacao : apresentacoes) {
            if (apresentacao.getProjeto().obterNome().equals(nomeProjeto)) {
                return apresentacao;
            }
        }
        return null;
    }
}


