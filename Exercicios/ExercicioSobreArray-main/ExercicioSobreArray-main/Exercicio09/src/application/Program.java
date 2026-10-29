package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        String[] vetorNomes = new String[n];
        int[] vetorIdades = new int[n]; 

        for (int i = 0; i < vetorIdades.length; i++) {            
            System.out.printf("Dados da %d° pessoa %n",i + 1);
            System.out.print("Nome: ");
            vetorNomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetorIdades[i] = sc.nextInt();
            sc.nextLine();
        }
        int maiorIdade = vetorIdades[0];
        int salvePosicaoMaior = 0;
        for (int i = 1; i < vetorIdades.length; i++) {
            if (maiorIdade < vetorIdades[i]) {
                maiorIdade = vetorIdades[i];
                salvePosicaoMaior = i;
            }
        }
        System.out.println("Pesso mais velha é : " + vetorNomes[salvePosicaoMaior]);

        sc.close();
    }
}
