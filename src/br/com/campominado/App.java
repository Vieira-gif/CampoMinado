package br.com.campominado;

import br.com.campominado.modelo.Tabuleiro;

public class App {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        System.out.println(tabuleiro);
    }
}
