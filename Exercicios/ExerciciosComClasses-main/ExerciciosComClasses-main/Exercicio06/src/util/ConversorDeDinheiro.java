package util;

public class ConversorDeDinheiro {
    public static final double IOF = 0.06;
    public static double comprandoDolar (double cotacao, double quantidade){
        return (cotacao * quantidade) * (1 + IOF);
    }
}
