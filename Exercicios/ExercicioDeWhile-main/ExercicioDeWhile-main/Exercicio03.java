import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int alcool =0,disel=0,gasolina=0,verificador= 0;
        while (verificador !=4) {
            System.out.printf("Qual a sua preferencia: \n1-Álcool \n2-Disel \n3-Gasolina \n4-Finalizar\n");
            verificador = ler.nextInt();
            switch (verificador) {
                case 1:
                    alcool++;
                    break;
                case 2: 
                    disel ++;
                    break;
                case 3 :
                    gasolina ++;
                    break;
                case 4:
                    System.out.printf("MUITO OBRIGADO \n Álcool: %d \n Disel: %d \n Gasolina: %d \n",alcool,disel,gasolina);
                    break;
                default:
                    break;
            }
        }
        ler.close();
    }
}   
