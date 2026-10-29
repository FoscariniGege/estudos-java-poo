
package application;

import java.util.Scanner;
import entities.Triangulo;

public class Program {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Triangulo t01 = new Triangulo();
      Triangulo t02 = new Triangulo();

      System.out.println("Entre com as dimensões do primeiro Triangulo[A] : ");
      t01.a = scanner.nextDouble();
      t01.b = scanner.nextDouble();
      t01.c = scanner.nextDouble();
      System.out.println("Entre com as dimensões do segundo Triangulo[B] : ");
      t02.a = scanner.nextDouble();
      t02.b = scanner.nextDouble();
      t02.c = scanner.nextDouble();

      double areaT01 = t01.area();
      double areaT02 = t02.area();

      System.out.printf("Triangulo X: %.2f %n", areaT01);
      System.out.printf("Triangulo Y: %.2f %n", areaT02);
      maior(areaT01, areaT02);
      scanner.close(); 
   }


   public static void maior(double a, double b) {
      if (a > b) {
         System.out.println("A maior área é do Triangulo X");
      } else if (a < b){
         System.out.println("A maior área é do Triangulo y");
      }else {
         System.out.println("As duas áreas são iguais");
      }

   }
}

