package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vetorPessoa = new Pessoa[n];

        for (int i = 0; i < vetorPessoa.length; i++) {

            System.out.printf("Altura da %d° pessoa: ",i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero (F/M) da %d° pessoa: ",i + 1);
            char genero = Character.toUpperCase(sc.next().charAt(0));
            sc.nextLine();
            vetorPessoa[i] = new Pessoa(altura, genero);
        }

        double menorAltura = vetorPessoa[0].getAltura();
        double maiorAltura = vetorPessoa[0].getAltura();

        for (int i = 1; i < vetorPessoa.length; i++) {
            if(maiorAltura < vetorPessoa[i].getAltura()) {
                maiorAltura = vetorPessoa[i].getAltura();
            }
            if(menorAltura > vetorPessoa[i].getAltura()){
                menorAltura = vetorPessoa[i].getAltura();
            }
        }
        System.out.printf("Menor altura: %.2f%n",menorAltura);
        System.out.printf("Maior altura: %.2f%n",maiorAltura);

        double somaDeAlturasDasMulheres = 0;
        int quantidadeDeMulheres = 0;
        int quantidadeDeHomens = 0;

        for (int i = 0; i < vetorPessoa.length; i++){
            if(vetorPessoa[i].getGenero() == 'f') {
                somaDeAlturasDasMulheres += vetorPessoa[i].getAltura();
                quantidadeDeMulheres++;
            }else{
                quantidadeDeHomens++;
            }
        }
        if (quantidadeDeMulheres == 0) {
            System.out.println("Não tem mulheres para ter media de altura");
        }else{
            double mediaDeAlturaDasMulheres = somaDeAlturasDasMulheres / quantidadeDeMulheres;
            System.out.printf("Media de altura das mulheres: %.2f%n",mediaDeAlturaDasMulheres);
        }
        System.out.printf("Quantidade de homens: %d%n", quantidadeDeHomens);
        sc.close();
    }
}
