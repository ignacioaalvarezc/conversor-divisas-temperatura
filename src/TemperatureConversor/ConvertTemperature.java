package TemperatureConversor;

import javax.swing.*;

public class ConvertTemperature {

    public double CelciusToFarenheit(double value) {
        double farenheit = value * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null,
                +value+ "grados celcius son " +farenheit+ "grados farenheit ");
        return farenheit;
    }

    public void CelciusToKelvin(double value) {
        double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin * 100d)/100;
        JOptionPane.showMessageDialog(null,
                +value+ " grados celcius son " +kelvin+ "grados kelvin");
    }

    public void FarenheitToCelcius(double value) {
        double celcius = (value - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null,
                +value+ " grados farenheit son " +celcius+ "grados celcius");
    }

    public double KelvinToCelcius(double value) {
        double celcius = value - 273.15;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null,
                +value+ " grados kelvin son " +celcius+ "grados celcius");
        return celcius;
    }

    public void KelvinToFarenheit(double value) {
        double farenheit = KelvinToCelcius(value);
        farenheit = CelciusToFarenheit(farenheit);
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null,
                +value+ " grados kelvin son " +farenheit+ "grados farenheit");
    }

}
