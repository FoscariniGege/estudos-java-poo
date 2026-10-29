package entities;

public class Posicao {
    public int posicaoLinha;
    public int posicaoColuna;
    
    public Posicao (int i, int j) {
        this.posicaoLinha = i;
        this.posicaoColuna = j;
    }

    public int getPosicaoLinha() {
        return posicaoLinha;
    }

    public int getPosicaoColuna() {
        return posicaoColuna;
    }

    @Override 
    public String toString () {
        return String.format("Posiçao: [%d] [%d]", this.posicaoLinha, this.posicaoColuna);
    }
}
