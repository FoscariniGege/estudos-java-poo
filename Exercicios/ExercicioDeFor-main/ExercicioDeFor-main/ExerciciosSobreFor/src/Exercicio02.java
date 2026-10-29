import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,in,out;
        in = 0;
        out = 0;
        System.out.print("Escolha quantos numeros serão lidos: ");
        N=scanner.nextInt();
        for(int i=1;i<=N;i++){
            System.out.printf("Numero %d: ",i);
             int X = scanner.nextInt();
            if(X>=10 && X<=20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println("-------------- SAIDA --------------");
        System.out.printf("Dentro do escopo: %d \n",in);
        System.out.printf("Fora do escopo: %d \n",out);
        scanner.close();
    }
}
