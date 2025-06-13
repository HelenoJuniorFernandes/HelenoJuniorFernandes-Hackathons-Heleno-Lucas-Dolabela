package com.hackathon;

import com.hackathon.collection.Apresentacoes;
import com.hackathon.collection.Equipes;
import com.hackathon.model.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe();
        for (int i = 1; i <= 5; i++) {
            equipe1.adicionarMembro(new Estudante("Estudante " + i + "-E1", "estudante" + i + "e1@email.com", "MAT" + i + "E1"));
        }
        Equipes.getInstance().adicionarEquipe(equipe1);

        Equipe equipe2 = new Equipe();
        for (int i = 1; i <= 5; i++) {
            equipe2.adicionarMembro(new Estudante("Estudante " + i + "-E2", "estudante" + i + "e2@email.com", "MAT" + i + "E2"));
        }
        Equipes.getInstance().adicionarEquipe(equipe2);

        Projeto projeto1 = new Projeto("Projeto Alpha", equipe1);
        projeto1.adicionarOrientador(new Profissional("Prof. Carlos", "carlos@email.com", "REG123"));

        Projeto projeto2 = new Projeto("Projeto Beta", equipe2);
        projeto2.adicionarOrientador(new Profissional("Prof. Ana", "ana@email.com", "REG456"));

        Banca banca1 = new Banca(projeto1);
        banca1.adicionarJurado(new Jurado("Jurado A", "jura@email.com", "JUR001", "Software"), 8);
        banca1.adicionarJurado(new Jurado("Jurado B", "jurb@email.com", "JUR002", "Design"), 7);
        banca1.adicionarJurado(new Jurado("Jurado C", "jurc@email.com", "JUR003", "Negócios"), 9);
        banca1.adicionarJurado(new Jurado("Jurado D", "jurd@email.com", "JUR004", "Inovação"), 8);

        Banca banca2 = new Banca(projeto2);
        banca2.adicionarJurado(new Jurado("Jurado E", "jure@email.com", "JUR005", "Software"), 6);
        banca2.adicionarJurado(new Jurado("Jurado F", "jurf@email.com", "JUR006", "Design"), 7);
        banca2.adicionarJurado(new Jurado("Jurado G", "jurg@email.com", "JUR007", "Negócios"), 5);
        banca2.adicionarJurado(new Jurado("Jurado H", "jurh@email.com", "JUR008", "Inovação"), 6);

        Sala sala1 = new Sala("Sala 101", "Bloco A");
        Sala sala2 = new Sala("Sala 102", "Bloco B");

        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        apresentacao1.realizarApresentacao();
        Apresentacoes.getInstance().adicionarApresentacao(apresentacao1);

        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.now().plusHours(1));
        apresentacao2.realizarApresentacao();
        Apresentacoes.getInstance().adicionarApresentacao(apresentacao2);

        System.out.println("\nProjetos Aprovados (Nota >= 7):");
        List<Projeto> projetosAprovados = Equipes.getInstance().getEquipes().stream()
                .map(Equipe::obterProjeto)
                .filter(p -> p != null && p.getNotaFinal() >= 7)
                .collect(Collectors.toList());

        if (projetosAprovados.isEmpty()) {
            System.out.println("Nenhum projeto aprovado.");
        } else {
            for (Projeto p : projetosAprovados) {
                System.out.println("- " + p.obterNome() + " (Nota: " + p.getNotaFinal() + ")");
            }
        }
    }
}


