import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos pares de numeros você quer ler: ");
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("Numero 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Numero 2: ");
            double num2 = scanner.nextDouble();
            if(num2 == 0.0){
                System.out.println("Divisão Impossivel");
            }else{
                double divisao = num1/num2;
                System.out.printf("A divisão entre %.1f e %.1f é de %.1f %n",num1,num2,divisao);
            }
        }
        scanner.close();
    }
}
