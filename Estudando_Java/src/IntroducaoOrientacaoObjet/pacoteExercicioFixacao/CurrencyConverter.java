package pacoteExercicioFixacao;

public class CurrencyConverter {
    public static double priceInReais(double dollarPrice, double manyDollar){
        double iof = (dollarPrice*manyDollar)*0.06;
        return dollarPrice*manyDollar+iof;
    }
}
