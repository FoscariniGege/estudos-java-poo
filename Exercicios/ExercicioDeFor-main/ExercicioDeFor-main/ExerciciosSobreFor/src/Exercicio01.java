import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Entre com um numero para nos vermos quais são seus numero impares");
        x=scanner.nextInt();
        if(x<1){
            System.out.println("O numero tem que ser maior ou igual a 1 ");
        }else{
            for (int i = 1; i<=x ; i+=2){
                    System.out.println(i);
            }
        }
        scanner.close();
    }
}
