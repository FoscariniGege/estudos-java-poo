package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario01 = new Funcionario();
        System.out.print("Nome: ");
        funcionario01.nome = scanner.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario01.salarioBruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        funcionario01.imposto = scanner.nextDouble();

        System.out.println(funcionario01);
        System.out.print("Qual porcentagem quer aumentar o salario: ");
        double acrescimo = scanner.nextDouble();
        funcionario01.acrescentandoSalario(acrescimo);
        System.out.println(funcionario01);

        scanner.close();
    }
}
