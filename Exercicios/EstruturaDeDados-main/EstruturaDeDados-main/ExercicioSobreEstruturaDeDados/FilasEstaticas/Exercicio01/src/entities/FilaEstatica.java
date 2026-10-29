package entities;

public class FilaEstatica {
    private static final int TAM = 20;
    private Integer[] fila;
    private int fim;
    private int inicio;
    private int quantidade;

    public FilaEstatica() {
        this.fila = new Integer[TAM];
        this.fim = 0;
        this.inicio = 0;
        this.quantidade = 0;
    }

    public boolean filaVazia() {
        return this.quantidade == 0;
    }

    public boolean filaCheia() {
        return this.quantidade == TAM;
    }

    public int quantidadeDeElementos() {
        return this.quantidade; 
    }

    public boolean enfileirar(int valor) {
        if (filaCheia()) {
            System.out.println("A fila esta cheia !!");
            return false;
        }
        this.fila[this.fim] = valor;
        this.fim = (this.fim + 1) % TAM;
        this.quantidade++;
        return true;
    }

    public Integer desenfileirar() {
        if (filaVazia()) {
            System.out.println("Fila esta vazia !!");
            return null;
        }
        int valorRemovido = this.fila[this.inicio];
        this.fila[this.inicio] = null; // Limpa a posição
        this.inicio = (this.inicio + 1) % TAM; // Avança o início
        this.quantidade--;
        return valorRemovido;
    }

    public Integer frenteDaFila() {
        if (filaVazia()) {
            System.out.println("Fila esta vazia !!");
            return null;
        }
        return this.fila[this.inicio];
    }
}