package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você ira digitar: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++ ){
            System.out.print("Digite o "+ (i + 1) +"° numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("NUMERO PARES");
        int quantidadesDeNumerosPares = 0;
        for(int i = 0; i < vetor.length; i++ ){
            if((vetor[i] % 2) == 0){
                System.out.println(vetor[i]);
                quantidadesDeNumerosPares++;
            }
        }
        System.out.println("Quantidade de numeros pares = " + quantidadesDeNumerosPares);
        sc.close();
    }
}
