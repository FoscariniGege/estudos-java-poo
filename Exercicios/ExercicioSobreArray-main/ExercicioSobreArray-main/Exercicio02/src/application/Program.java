package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero ira digitar: ");
        int tamanhoDoVetor = sc.nextInt();
        double[] vetor = new double[tamanhoDoVetor];

        double soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Entre com o numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("  %.2f  ",vetor[i]);
            soma += vetor[i];
        }

        double media = soma/vetor.length;
        System.out.printf("%nSoma = %.2f%nMedia = %.2f%n",soma,media);
        sc.close();
    }
}
