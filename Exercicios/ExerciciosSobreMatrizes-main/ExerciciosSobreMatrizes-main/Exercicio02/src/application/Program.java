package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Posicao;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("Entre com o tamanho da matriz: ");
        System.out.print("Linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Colunas: ");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("------ DECLARAÇÃO DA MATRIZ --------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }*/

        int linhas = 3;
        int colunas = 4;
        int [][] matriz = {
            {10,8,15,12},
            {21,11,23,8},
            {14,5,13,19}
        };

        System.out.println("Digite o numero que quer procurar: ");
        int numProcura = sc.nextInt();

        List<Posicao> listaDePosicoes = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == numProcura){
                    Posicao numeroIgual = new Posicao(i,j);
                    listaDePosicoes.add(numeroIgual);
                }
            }
        }

       for (int i = 0; i < listaDePosicoes.size(); i++) {
            Posicao pos = listaDePosicoes.get(i);
            int lin = pos.getPosicaoLinha();
            int col = pos.getPosicaoColuna();           //1          4
            System.out.println("Posição encontrada: [" + lin + "," + col + "]");
            if (col > 0) {
                System.out.println("Esquerda: " + matriz[lin][col - 1]);
            }
            if (col < colunas - 1) {
                System.out.println("Direita: " + matriz[lin][col + 1]);
            }
            if (lin > 0) {
                System.out.println("Acima: " + matriz[lin - 1][col]);
            }
            if (lin < linhas - 1) {
                System.out.println("Abaixo: " + matriz[lin + 1][col]);
            }
            System.out.println(); 
        }



        sc.close();
    }
}
