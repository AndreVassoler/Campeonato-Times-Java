package service;

import model.Campeonato;
import model.Time;
import java.util.List;

public class CampeonatoService {

    public void atualizarPontuacao(Campeonato campeonato, String nomeTime, int pontos) {
        for (Time time : campeonato.getTimes()) {
            if (time.getNome().equalsIgnoreCase(nomeTime)) {
                time.adicionarPontos(pontos);
                return;
            }
        }
        System.out.println("Time não encontrado no campeonato " + campeonato.getNome() + "!");
    }

    public void mostrarClassificacao(Campeonato campeonato) {
        List<Time> times = campeonato.getTimes();
        times.sort((t1, t2) -> Integer.compare(t2.getPontos(), t1.getPontos()));
        System.out.println("\nClassificação do Campeonato " + campeonato.getNome() + ":");
        for (int i = 0; i < times.size(); i++) {
            System.out.println((i + 1) + ". " + times.get(i).getNome() + " - " + times.get(i).getPontos() + " pontos");
        }
    }
}
