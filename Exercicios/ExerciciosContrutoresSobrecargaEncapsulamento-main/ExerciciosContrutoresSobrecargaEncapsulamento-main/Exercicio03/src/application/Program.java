package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Streaming;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Streaming cliente01;

        System.out.print("Codigo da assinatura: ");
        int codAssinatura = Integer.parseInt(sc.nextLine());
        System.out.print("E-mail do titular: ");
        String email = sc.nextLine();
        System.out.print("Deseja iniciar o plano gratuito: [S/N]  ");
        String validacao = sc.nextLine().toUpperCase();
        switch (validacao) {
            case "S":
                cliente01 = new Streaming(codAssinatura, email);
                break;
            default:
                System.out.print("Informe o plano (BASICO/PREMIUM):");
                String plano = sc.nextLine().toUpperCase();
                System.out.print("Informe a quantidade de meses contratados: ");
                int meses = sc.nextInt();
                cliente01 = new Streaming(codAssinatura, email, plano, meses);
                break;
        }
        System.out.println(cliente01);

        System.out.print("Informe a quantidade de dias que se passaram: ");
        int dias = sc.nextInt();
        cliente01.removeDias(dias);
        System.out.println(cliente01);

        System.out.print("Quantos meses quer renovar: ");
        int meses = sc.nextInt();
        sc.nextLine();
        cliente01.adicionarDias(meses);
        System.out.println(cliente01);

        System.out.print("Deseja realizar upgrade para o plano PREMIUM (s/n)? ");
        validacao = sc.nextLine().toUpperCase();
        cliente01.upgradePlano(validacao);
        System.out.println(cliente01);
        sc.close();
    }
}
