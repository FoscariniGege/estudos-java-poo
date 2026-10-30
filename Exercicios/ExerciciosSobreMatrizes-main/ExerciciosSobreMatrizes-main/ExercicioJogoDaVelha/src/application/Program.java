package application;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private static final Random random = new Random();

    public static void main(String[] args) {
        final String JOGADORX = "X";
        final String JOGADORO = "O";

        Scanner sc = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

        System.out.println("Tabuleiro criado!");
        System.out.println("Você será o X. Informe a linha (0 a 2) e a coluna (0 a 2) onde deseja jogar.");
        imprimirTabuleiro(tabuleiro);

        boolean jogando = true;
        while (jogando) {
            int linha;
            int coluna;

            try {
                System.out.print("Linha: ");
                linha = sc.nextInt();
                System.out.print("Coluna: ");
                coluna = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
                sc.nextLine();
                continue;
            }

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                if (tabuleiro[linha][coluna].equals(" ")) {
                    tabuleiro[linha][coluna] = JOGADORX;

                    if (verificarVitoria(tabuleiro, JOGADORX)) {
                        imprimirTabuleiro(tabuleiro);
                        System.out.println("Parabéns! O jogador " + JOGADORX + " venceu!");
                        break;
                    }
                    if (tabuleiroCheio(tabuleiro)) {
                        imprimirTabuleiro(tabuleiro);
                        System.out.println("O jogo terminou empatado.");
                        break;
                    }

                    System.out.println("\nVez do Jogador O");
                    jogadorO(tabuleiro);

                    if (verificarVitoria(tabuleiro, JOGADORO)) {
                        imprimirTabuleiro(tabuleiro);
                        System.out.println("O jogador " + JOGADORO + " venceu!");
                        break;
                    }

                    if (tabuleiroCheio(tabuleiro)) {
                        imprimirTabuleiro(tabuleiro);
                        System.out.println("O jogo terminou empatado.");
                        break;
                    }
                    imprimirTabuleiro(tabuleiro);
                } else {
                    System.out.println("Essa posição já está ocupada!");
                }
            } else {
                System.out.println("A localização não existe! Digite valores entre 0 e 2.");
            }
        }

        sc.close();
    }

    public static void imprimirTabuleiro(String[][] matriz) {
        System.out.println("+----+----+----+");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("+----+----+----+");
    }

    public static boolean verificarVitoria(String[][] tabuleiro, String jogador) {
        for (int i = 0; i < 3; i++) {
            if (jogador.equals(tabuleiro[i][0]) &&
                jogador.equals(tabuleiro[i][1]) &&
                jogador.equals(tabuleiro[i][2])) {
                return true;
            }
            if (jogador.equals(tabuleiro[0][i]) &&
                jogador.equals(tabuleiro[1][i]) &&
                jogador.equals(tabuleiro[2][i])) {
                return true;
            }
        }
        if (jogador.equals(tabuleiro[0][0]) &&
            jogador.equals(tabuleiro[1][1]) &&
            jogador.equals(tabuleiro[2][2])) {
            return true;
        }
        if (jogador.equals(tabuleiro[0][2]) &&
            jogador.equals(tabuleiro[1][1]) &&
            jogador.equals(tabuleiro[2][0])) {
            return true;
        }
        return false;
    }

    public static boolean tabuleiroCheio(String[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void jogadorO(String[][] matriz) {
        int linha;
        int coluna;

        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!matriz[linha][coluna].equals(" "));

        matriz[linha][coluna] = "O";
    }
}
