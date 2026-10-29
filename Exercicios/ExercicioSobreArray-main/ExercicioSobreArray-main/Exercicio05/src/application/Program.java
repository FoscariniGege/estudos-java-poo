package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números quer digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetor[i] = sc.nextDouble();
        }
        double maior = vetor[0];
        int posicaoDoMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoDoMaior = i;
            }
        }
        System.out.println("\nMaior valor = " + maior);
        System.out.println("Posição do maior valor = " + posicaoDoMaior);

        sc.close();
    }
}