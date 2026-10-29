package entities;

public class ContaBancaria {
    private final int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(int numeroDaConta,String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
    }

    public ContaBancaria(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        depositar(depositoInicial);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public String getNomeDoTitular() {
        return nomeDoTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= (valor+5);
    }

    @Override 
    public String toString(){
        return String.format("----------------------------------------------------------------------------%n"+
                             "Conta: %d%n"+
                             "Nome do Titular: %s%n"+
                             "Capital: %.2f%n"+
                             "----------------------------------------------------------------------------",
                             numeroDaConta,nomeDoTitular,saldo);         
    }
}
