package TemperatureConversor;

import javax.swing.*;

public class TemperatureConvertFunction {

    ConvertTemperature temperature = new ConvertTemperature();

    public void ConvertTemperature(double Minput) {
        String option = (JOptionPane.showInputDialog(null,
                "Elije una opción para convertir", "Temperature",
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                        "Grados celcius a grados Farenheit",
                        "Grados celcius a grados kelvin",
                        "Grados Farenheit a grados celcius",
                        "Kelvin a grados celcius",
                        "Kelvin a grados farenheit"},
                "Selection")).toString();
            switch(option) {
                case "Grados celcius a grados farenheit":
                    temperature.CelciusToFarenheit(Minput);
                    break;
                case "Grados celcius a grados kelvin":
                    temperature.CelciusToKelvin(Minput);
                    break;
                case "Grados farenheit a grados celcius":
                    temperature.FarenheitToCelcius(Minput);
                    break;
                case "Grados kelvin a grados celcius":
                    temperature.KelvinToCelcius(Minput);
                    break;
                case "Grado kelvin a grados farenheit":
                    temperature.KelvinToFarenheit(Minput);
                    break;
            }
    }
}
