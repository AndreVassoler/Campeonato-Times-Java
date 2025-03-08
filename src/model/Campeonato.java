package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Time> times;

    public Campeonato(String nome, LocalDate dataInicial, LocalDate dataFinal) {
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.times = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void adicionarTime(Time time) {
        times.add(time);
    }
}
