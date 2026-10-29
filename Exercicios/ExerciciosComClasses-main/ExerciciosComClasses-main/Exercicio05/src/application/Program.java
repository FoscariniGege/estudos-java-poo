package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Aluno aluno01 = new Aluno();
        System.out.print("Entre com o nome do aluno: ");
        aluno01.nome = scanner.nextLine();
        System.out.println("Entre com as notas: ");
        aluno01.nota01 = scanner.nextDouble();
        aluno01.nota02 = scanner.nextDouble();
        aluno01.nota03 = scanner.nextDouble();
        System.out.println(aluno01);

        scanner.close();
    }
}
