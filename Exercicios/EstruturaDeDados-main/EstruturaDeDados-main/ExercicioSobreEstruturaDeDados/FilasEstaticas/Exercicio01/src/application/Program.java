package application;

import java.util.Scanner;
import entities.FilaEstatica;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaEstatica fila = new FilaEstatica();
        boolean executando = true;

        do {
            menu();
            System.out.print("Escolha uma opção: ");
            int opcaoDoUsuario = sc.nextInt();

            switch (opcaoDoUsuario) {
                case 1:
                    if (fila.filaVazia()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("A fila não está vazia.");
                    }
                    break;

                case 2:
                    if (fila.filaCheia()) {
                        System.out.println("A fila está cheia.");
                    } else {
                        System.out.println("A fila não está cheia.");
                    }
                    break;

                case 3:
                    System.out.println("A quantidade de elementos na fila é: " + fila.quantidadeDeElementos());
                    break;

                case 4:
                    Integer frente = fila.frenteDaFila();
                    if (frente != null) {
                        System.out.println("O elemento no início da fila é: " + frente);
                    }
                    break;

                case 5:
                    System.out.print("Elemento a ser acrescentado: ");
                    int valor = sc.nextInt();
                    if (fila.enfileirar(valor)) {
                        System.out.println("Valor " + valor + " enfileirado com sucesso!");
                    }
                    break;

                case 6:
                    Integer removido = fila.desenfileirar();
                    if (removido != null) {
                        System.out.println("O elemento que foi removido é: " + removido);
                    }
                    break; // Corrigido: evita fechar o programa ao remover

                case 7:
                    System.out.println("Encerrando o programa...");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um valor entre 1 e 7.");
                    break;
            }
        } while (executando);

        sc.close();
    }

    public static void menu() {
        System.out.println("\n================================================");
        System.out.println("1 - Verificar se a fila está vazia");
        System.out.println("2 - Verificar se a fila está cheia");
        System.out.println("3 - Verificar a quantidade de elementos na fila");
        System.out.println("4 - Verificar qual elemento está no início da fila");
        System.out.println("5 - Acrescentar elemento na fila");
        System.out.println("6 - Remover elemento da fila");
        System.out.println("7 - Sair");
        System.out.println("================================================");
    }
}