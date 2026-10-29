package entities;

public class Streaming {
    private final int codAssinatura;
    private String email;
    private String plano; 
    private String status;
    private int diasRestantes;

    public Streaming(int codAssinatura, String email){
        this.codAssinatura = codAssinatura;
        this.email = email;
        this.diasRestantes = 7;
        this.plano = "BASICO";
        this.status = "ATIVO";
    }
    public Streaming(int codAssinatura, String email, String plano, int meses){
        this.codAssinatura = codAssinatura;
        this.email = email;
        this.plano = plano;
        this.status = "ATIVO";
        adicionarDias(meses);

    }




    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCodAssinatura() {
        return codAssinatura;
    }
    public String getEmail() {
        return email;
    }
    public String getPlano() {
        return plano;
    }
    public String getStatus() {
        return status;
    }
    public int getDiasRestantes() {
        return diasRestantes;
    }




    public void adicionarDias(int meses){
        this.diasRestantes +=(meses*30);
        updateStatus();
    }

    public void removeDias(int dias){
        this.diasRestantes -= dias;
        updateStatus();
    }

    private void updateStatus(){
        if(diasRestantes <= 0 ){
            this.status = "INATIVO";
            this.diasRestantes = 0;
        }else{
            this.status = "ATIVO";
        }
    }

    public void upgradePlano(String validacao){
        if(validacao.equals("S")){
            this.plano = "PREMIUM";
        }
    }

    @Override 
    public String toString(){
        return String.format("-------------------------------------------%n"+"Assinatura: %d%n"+
                             "Titular: %s%n"+
                             "Plano: %s%n"+
                             "Dias restantes: %d%n"+
                             "Status: %s%n"+
                             "-------------------------------------------",
                              codAssinatura,email,plano,diasRestantes,status);
    }
}
