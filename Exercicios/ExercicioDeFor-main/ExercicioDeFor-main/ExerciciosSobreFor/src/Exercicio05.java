import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ente com um numero para fazermos o fatorial: ");
        int n = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i<=n;i++){
            fatorial=fatorial*i;
        }
        System.out.printf("o fatorial de %d é %d",n,fatorial);
        scanner.close();
    }
}
