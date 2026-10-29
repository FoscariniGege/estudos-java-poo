package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import util.Util;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos funcionarios será registrados: ");
        int qntFuncionarios = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.println();
            System.out.println("Funcionario " + (i+1) + "#");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            Funcionario testeDoId = Util.buscarId(lista, id);
            if ( testeDoId == null ) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Salario: ");
                Double salario = sc.nextDouble();
                Funcionario func = new Funcionario(nome, id, salario);
                lista.add(func);
            } else {
                System.out.println("Esse Id já foi utilizado");
                i--;
            }
        }

        System.out.print("Entre com o Id do funcionario que irá receber o aumento: ");
        int idAumento = sc.nextInt();
       
        Funcionario funcDoAumento = Util.buscarId(lista, idAumento);

       if (funcDoAumento != null) {
            System.out.print("Entre com a porcentagem de aumento: ");
            double aumentoSalario = sc.nextDouble();
            funcDoAumento.adicionandoSalario(aumentoSalario);
       } else {
            System.out.println("Esse Id não existe ");
       }
       System.out.println();
       Util.percorrerLista(lista);
        sc.close();
    }
}
