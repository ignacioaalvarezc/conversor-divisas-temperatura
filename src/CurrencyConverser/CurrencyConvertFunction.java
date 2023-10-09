package CurrencyConverser;

import javax.swing.*;

public class CurrencyConvertFunction {
    PesoToCurrency currency = new PesoToCurrency();
    CurrencyToPeso pesos = new CurrencyToPeso();

    public void PesoToCurrency(double Minput) {
        String option = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Peso a Dólar", "Peso a Euro", "Peso a Libras", "Peso a Yen", "Peso a Won",
                            "Dólar a Peso", "Euro a Peso", "Libra a Peso", "Yen a Peso", "Won a Peso"},
                "Selection")).toString();
        switch(option) {
            case "Peso to Dollar":
                currency.PesoToDollar(Minput);
                break;
            case "Peso to Euro":
                currency.PesoToEuro(Minput);
                break;
            case "Peso to Pound":
                currency.PesoToPound(Minput);
                break;
            case "Peso to Yen":
                currency.PesoToYen(Minput);
                break;
            case "Peso to Won":
                currency.PesoToWon(Minput);
                break;
            case "Dólar a Peso":
                pesos.DollarToPeso(Minput);
                break;
            case "De Euro a Pesos":
                pesos.EuroToPeso(Minput);
                break;
            case "De Libras a Pesos":
                pesos.PoundToPeso(Minput);
                break;
            case "De Yen a Pesos":
                pesos.YenToPeso(Minput);
                break;
            case "De Won Coreano a Pesos":
                pesos.WonToPeso(Minput);
                break;
        }
    }

}
