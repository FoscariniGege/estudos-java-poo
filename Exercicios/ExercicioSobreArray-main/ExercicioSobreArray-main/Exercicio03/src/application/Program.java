package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int tamanhoDoVetor = sc.nextInt();
        Pessoa[] vetor = new Pessoa[tamanhoDoVetor];

        double somaAlturas = 0.0;
        int contMenores = 0;

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine(); // Limpa o buffer do Scanner
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            vetor[i] = new Pessoa();

            System.out.print("Nome: ");
            vetor[i].nome = sc.nextLine();
            System.out.print("Idade: ");
            vetor[i].idade = sc.nextInt();
            System.out.print("Altura: ");
            vetor[i].altura = sc.nextDouble();

            somaAlturas += vetor[i].altura;
            if (vetor[i].idade < 16) {
                contMenores++;
            }
        }

        double mediaAlturas = somaAlturas / vetor.length;
        double porcentagemMenores = ((double) contMenores / vetor.length) * 100.0;

        System.out.printf("%nAltura média: %.2f%n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].idade < 16) {
                System.out.println(vetor[i].nome);
            }
        }

        sc.close();
    }
}