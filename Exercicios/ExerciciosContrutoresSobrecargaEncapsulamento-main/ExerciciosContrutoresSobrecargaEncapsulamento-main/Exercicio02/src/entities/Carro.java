package entities;

public class Carro {
    private final int MAXTANQUE = 55;

    private String placa;
    private final String modelo;
    private double quilometragem;
    private double tanque = 5;

    public Carro (String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;

    }
    public Carro (String placa,String modelo, double quilometragem, double tanque){
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.tanque =  tanque;
    }

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public double getTanque() {
        return tanque;
    }
    
    public void abastecer (double combustivel){
        if(validacaoDoTanque(tanque,combustivel,MAXTANQUE)){
            this.tanque += combustivel;
        }else{
            this.tanque = MAXTANQUE;
        }
    }

    public static  boolean validacaoDoTanque(double tanque,double combustivel,int MAXTANQUE){
        if((tanque + combustivel) > MAXTANQUE){
            return false;
        }else{
            return true;
        }
    }

    public void viajar (double distancia){
        double quilometroComTanque = this.tanque * 10;
        if (quilometroComTanque < distancia){ 
            System.out.println("Combustivel insuficiente");
        }else{
            double litrosComKM = distancia / 10;
            andar(litrosComKM,distancia);
        }
    }

    private void andar (double litro,double quilometro){
        this.tanque -= litro;
        this.quilometragem += quilometro;
    }


    @Override 
    public String toString(){
        return String.format("--------------------------------------%n"+
                             "Veiculo: %s%n"+
                             "Modelo: %s%n"+
                             "Quilometragem: %.1f%n"+
                             "Tanque: %.1f%n",
                             placa,modelo,quilometragem,tanque);
    }
}
