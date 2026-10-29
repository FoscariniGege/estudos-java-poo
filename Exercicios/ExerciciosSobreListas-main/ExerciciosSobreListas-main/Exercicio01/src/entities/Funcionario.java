package entities;

public class Funcionario {
    private String nome;
    private Integer codigo;
    private Double salario;

    public Funcionario(String nome, Integer codigo, Double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getSalario() {
        return salario;
    }

    public void adicionandoSalario(Double porcentagem) {
        this.salario *= ((porcentagem/100)+1);
    }


    @Override 
    public String toString(){
        return String.format("%d, %s, %.2f", this.codigo, this.nome, this.salario);
    }
}
