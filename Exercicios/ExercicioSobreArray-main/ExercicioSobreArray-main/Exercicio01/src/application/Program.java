package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("Entre com a quantidade de numeros que você quer ler: ");
            n = sc.nextInt();
        }while(n > 10);
        int[] vector = new int[n]; 

        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um numero: "); 
            vector[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < vector.length; i++){
            if(vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
