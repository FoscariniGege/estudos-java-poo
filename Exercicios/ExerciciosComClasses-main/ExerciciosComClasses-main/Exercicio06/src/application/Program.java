package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeDinheiro;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor do dolar: ");
        double cotacao =scanner.nextDouble();
        System.out.print("Entre com o valor que você quer comprar: ");
        double valorDolar = scanner.nextDouble();
        System.out.printf("O valor em reais é: %.2f%n", ConversorDeDinheiro.comprandoDolar(cotacao, valorDolar));

        scanner.close();
    }
}
