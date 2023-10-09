package CurrencyConverser;
// IMPORTS JAVAX.SWING
import javax.swing.JOptionPane;

public class PesoToCurrency {

    // PESO TO DOLLAR CLASS
    public void PesoToDollar(double value) {
        double dollarCoin = value / 3739.00;
        dollarCoin = (double) Math.round(dollarCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dollarCoin+ " Dolares");
    }

    // PESO TO EURO
    public void PesoToEuro(double value) {
        double euroCoin = value / 4050.48;
        euroCoin = (double) Math.round(euroCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroCoin+ " Euros");
    }

    // PESO TO POUNDS
    public void PesoToPound(double value) {
        double poundCoin = value / 4890.52;
        poundCoin = (double) Math.round(poundCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +poundCoin+ " Euros");
    }

    // PESO TO YEN
    public void PesoToYen(double value) {
        double yenCoin = value / 29.68;
        yenCoin = (double) Math.round(yenCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yenCoin+ " Yen");
    }

    // PESO TO WON
    public void PesoToWon(double value) {
        double wonCoin = value / 3.04;
        wonCoin = (double) Math.round(wonCoin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonCoin+ " Won");
    }


}
