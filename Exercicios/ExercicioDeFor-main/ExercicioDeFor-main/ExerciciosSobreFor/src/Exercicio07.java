import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 1 ; i <= n ; i++ ){
            System.out.printf("%d %d %d %n",i,(i*i),(i*i*i));
        }
        scanner.close();
    }
}
