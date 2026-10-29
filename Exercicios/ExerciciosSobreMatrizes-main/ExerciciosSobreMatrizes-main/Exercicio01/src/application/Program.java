package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade da matriz: ");
        int n = sc.nextInt();
        Integer[][] matriz = new Integer[n][n];
        System.out.println();
        System.out.println("Digite a sua matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length; i++) {
            System.out.print((i+1) + ": [");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("]");
        }
        int qntNegativos = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j =0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    qntNegativos++;
                }

            }
        }

        System.out.println("quantidade de numeros negativos: " + qntNegativos);
        System.out.print("Diagonal principal : [");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("]");
        sc.close();
    }
}
