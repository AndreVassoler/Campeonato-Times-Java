package controller;

import model.Campeonato;
import model.Time;
import service.CampeonatoService;
import java.time.LocalDate;

public class CampeonatoController {
    private Campeonato campeonato;
    private CampeonatoService service;

    public CampeonatoController(String nome, LocalDate dataInicial, LocalDate dataFinal) {
        this.campeonato = new Campeonato(nome, dataInicial, dataFinal);
        this.service = new CampeonatoService();
    }

    public void adicionarTime(String nomeTime) {
        campeonato.adicionarTime(new Time(nomeTime));
    }

    public void atualizarPontuacao(String nomeTime, int pontos) {
        service.atualizarPontuacao(campeonato, nomeTime, pontos);
    }

    public void mostrarClassificacao() {
        service.mostrarClassificacao(campeonato);
    }
}
