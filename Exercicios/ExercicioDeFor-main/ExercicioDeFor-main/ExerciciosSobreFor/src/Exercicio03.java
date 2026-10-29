import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecione a quantidade de testes que você quer fazer: ");
        int n = scanner.nextInt();
        for (int i = 0; i<n ; i++){
            System.out.println("Selecione os numeros que quer fazer a media: ");
            float num1=scanner.nextFloat()*2;
            float num2=scanner.nextFloat()*3;
            float num3=scanner.nextFloat()*5;
            float mediaPonderada = (num1+num2+num3)/10;
            System.out.printf("A media ponderada desses valores são: %.2f \n",mediaPonderada);
        }

        scanner.close();
    }
}
