package br.com.campominado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos  = new ArrayList<Campo>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    private void sortearMinas() {
        for (int linha = 0; linha < this.linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linha, coluna));
            }
        }
    }

    private void associarOsVizinhos() {
        for(Campo c1 : campos) {
            for(Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void gerarCampos() {
        long minasArmadas = 0;

        Predicate<Campo> minado = Campo::isAMinado;

        do {
            minasArmadas = campos.stream().filter(minado).count();
            int aleatorio = 1;
            campos.get(aleatorio).minar();
        }while (minasArmadas < minas);
    }
}
