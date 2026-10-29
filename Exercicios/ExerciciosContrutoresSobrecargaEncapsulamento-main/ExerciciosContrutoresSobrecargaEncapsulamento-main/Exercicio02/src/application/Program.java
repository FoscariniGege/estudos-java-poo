package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Carro carro01;

        System.out.print("Entre com a placa: ");
        String placa = sc.nextLine();

        System.out.print("Entre com o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("O veiculo é um carro novo [S/N]: ");
        String verificacao = sc.nextLine().toUpperCase();
        switch (verificacao) {
            case "S":
                carro01 = new Carro(placa, modelo);   
                break;
            default:
                System.out.print("Entre com a quilometragem do carro: ");
                double quilometragem = sc.nextDouble();
                System.out.print("Entre com o combustivel inicial: ");
                double combustivelInicial = sc.nextDouble();
                carro01 = new Carro(placa, modelo, quilometragem,combustivelInicial);
                break;
        }
        System.out.println(carro01);

        System.out.print("Entre com a quantidade de combustivel para abastecer: ");
        double combustivel = sc.nextDouble();
        carro01.abastecer(combustivel);
        System.out.println(carro01);

        System.out.print("Entre com a distancia que quer viajar (km): ");
        double kmDeViagem = sc.nextDouble();
        carro01.viajar(kmDeViagem);
        System.out.println(carro01);

        sc.close();
    }
}
