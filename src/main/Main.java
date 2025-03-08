package main;

import controller.CampeonatoController;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CampeonatoController campeonatoController = new CampeonatoController("Copa Local", LocalDate.now(), LocalDate.now().plusDays(30));

        campeonatoController.adicionarTime("Time A");
        campeonatoController.adicionarTime("Time B");
        campeonatoController.adicionarTime("Time C");

        campeonatoController.atualizarPontuacao("Time A", 3);
        campeonatoController.atualizarPontuacao("Time B", 1);
        campeonatoController.atualizarPontuacao("Time C", 4);

        campeonatoController.mostrarClassificacao();
    }
}
