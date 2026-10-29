import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n / 2 ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
            System.out.println(n);
        }
        scanner.close();
    }
}
