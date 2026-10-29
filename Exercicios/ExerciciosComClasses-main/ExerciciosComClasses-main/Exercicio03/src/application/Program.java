import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo01 = new Retangulo();
    System.out.println("Entre com o seu retangulo: ");
    retangulo01.altura = scanner.nextDouble();
    retangulo01.largura = scanner.nextDouble();
    System.out.println(retangulo01);

    scanner.close();
}}
