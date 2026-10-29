package entities;

public class Aluno {
    public String nome;
    public double nota01;
    public double nota02;
    public double nota03;


    public double notaFinal(){
        return (nota01 + nota02 + nota03);
    }

    public String toString(){
        if(notaFinal() >= 60.0){
            return String.format("Nota Final = %.2f%nPassou", notaFinal());
        }else{
            return String.format("Nota Final = %.2f %nReprovado %nFaltou %.2f pontos",notaFinal(), 60-notaFinal());
        }
    }

    
}
