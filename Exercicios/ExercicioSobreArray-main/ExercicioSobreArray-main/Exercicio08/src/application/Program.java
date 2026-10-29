package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números vai ter no vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        int contadorDeNumerosPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contadorDeNumerosPares++;
            }
        }

        if (contadorDeNumerosPares > 0 ) {
            double media = soma / contadorDeNumerosPares; 
            System.out.printf("Média de números pares : %.1f%n",media);
        }else{
            System.out.println("Nenhum número par");
        }
        sc.close();
    }
}
