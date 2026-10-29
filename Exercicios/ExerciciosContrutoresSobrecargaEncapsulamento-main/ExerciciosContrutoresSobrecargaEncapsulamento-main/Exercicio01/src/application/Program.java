package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
   
     
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta01;

        System.out.print("Entre com sua conta: ");
        int conta = Integer.parseInt(scanner.nextLine());

        System.out.print("Entre com o nome do titular: ");
        String nomeDoTitular = scanner.nextLine();
        
        
        System.out.print("Você quer fazer um deposito inicial? [S/N] :  ");
        String validacao = scanner.nextLine().toUpperCase();
        switch (validacao) {
            case "S":
                System.out.print("Qual seu capital inicial: ");
                double capitalInicial = scanner.nextDouble();
                conta01 = new ContaBancaria(conta, nomeDoTitular,capitalInicial);
                break;
            default:
                conta01 = new ContaBancaria(conta, nomeDoTitular);
                break;
        }
        System.out.println(conta01);
        
        System.out.print("Entre com um deposito: ");
        double deposito = scanner.nextDouble();
        conta01.depositar(deposito);
        System.out.println(conta01);

        System.out.print("Entre com o valor que quer sacar: ");
        double saque = scanner.nextDouble();
        conta01.sacar(saque);
        System.out.println(conta01);



        scanner.close();

    }
}
