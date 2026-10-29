public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return largura * altura;
    }
    public double perimetro(){
        return 2 * (altura + largura);
    }
    public double diagonal(){
        return Math.sqrt((altura * altura) + (largura * largura));
    }

    public String toString(){
        return String.format("Area: %.2f%n"+
                             "Perimetro: %.2f%n"+
                             "Diagonal: %.2f%n",
                             area(),perimetro(),diagonal()    
        );
    }
}
