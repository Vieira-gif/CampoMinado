package br.com.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private boolean minado = false;
    private boolean ativo = false;
    private boolean marcado = false;

    private final int linha;
    private final int coluna;

    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }



}
