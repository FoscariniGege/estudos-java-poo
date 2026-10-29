package application;

import java.util.Scanner;

import entities.Product;


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product produto01 = new Product();

        System.out.println("Entre com os dados do produto: ");

        System.out.print("Nome: ");
        produto01.name= scanner.nextLine();

        System.out.print("Preço: ");
        produto01.price = scanner.nextDouble();

        System.out.print("Quantidade no estoque: ");
        produto01.quantity = scanner.nextInt();

        System.out.println(produto01);

        System.out.print("Selecione a quantidade que quer adicionar no estoque: ");
        int adicionar = scanner.nextInt();
        produto01.AddProducts(adicionar);
        System.out.println(produto01);

        System.out.print("Selecione a quantidade que quer remover no estoque: ");
        int remover = scanner.nextInt();
        produto01.RemoveProducts(remover);
        System.out.println(produto01);
    
        scanner.close();
    }
}
