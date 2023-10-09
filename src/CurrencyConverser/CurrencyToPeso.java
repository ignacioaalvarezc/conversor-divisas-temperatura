package CurrencyConverser;

import javax.swing.*;

public class CurrencyToPeso {

    //DOLLAR TO PESO
    public void DollarToPeso(double value) {
        double dollarCoin = value * 3739.00;
        dollarCoin = (double) Math.round(dollarCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dollarCoin+ "Pesos Colombianos");
    }

    // EURO TO PESO
    public void EuroToPeso(double value) {
        double euroCoin = value * 4050.48;
        euroCoin = (double) Math.round(euroCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroCoin+ "Pesos Colombianos");
    }

    // POUND TO PESO
    public void PoundToPeso(double value) {
        double poundCoin = value* 4890.52;
        poundCoin = (double) Math.round(poundCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +poundCoin+ "Pesos Colombianos");
    }

    // YEN TO PESO
    public void YenToPeso(double value) {
        double yenCoin = value * 29.68;
        yenCoin = (double) Math.round(yenCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yenCoin+ "Pesos Colombianos");
    }

    // WON TO PESO
    public void WonToPeso(double value) {
        double wonCoin = value * 3.04;
        wonCoin = (double) Math.round(wonCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonCoin+ "Pesos Colombianos");
    }
}
