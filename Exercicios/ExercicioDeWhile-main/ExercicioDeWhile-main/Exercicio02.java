import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x,y;
        System.out.print("Escolha seu X:");
        x=ler.nextInt();
        System.out.print("Escolha seu y:");
        y=ler.nextInt();
        while (x != 0 && y != 0 ){
            String teste = (x>0 ? "+":"-")+","+(y>0 ? "+":"-");
            switch (teste) {
                case "+,+":
                    System.out.printf("X[%d],Y[%d]: primeiro ", x,y);
                    break;
                case "-,+":
                    System.out.printf("X[%d],Y[%d]: segundo ", x,y);
                    break;
                case "-,-":
                    System.out.printf("X[%d],Y[%d]: terceiro ", x,y);
                    break;
                case "+,-":
                    System.out.printf("X[%d],Y[%d]: quarto ", x,y);
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.print("Escolha seu X:");
            x=ler.nextInt();
            System.out.print("Escolha seu y:");
            y=ler.nextInt();  
        }


        ler.close();
    }
}
