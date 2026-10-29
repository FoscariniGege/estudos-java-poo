package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void acrescentandoSalario(double acrescimo){
        salarioBruto *= ((acrescimo + 100) / 100);
    }

    public String toString(){
        return String.format("%s, $ %.2f", nome,salarioLiquido());
    }
}
