package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno[] vetorAlunos = new Aluno[n];

        for (int i = 0; i < vetorAlunos.length; i++) {
            System.out.printf("Dados do %d° aluno:%n", i + 1);
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Primeira nota: ");
            double nota1 = sc.nextDouble();
            
            System.out.print("Segunda nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            vetorAlunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < vetorAlunos.length; i++) {
            if (vetorAlunos[i].media() >= 6.0) {
                System.out.println(vetorAlunos[i].getNome());
            }
        }

        sc.close();
    }
}