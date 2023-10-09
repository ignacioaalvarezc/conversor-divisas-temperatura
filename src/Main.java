//IMPORTS OF PROJECTS
import CurrencyConverser.CurrencyConvertFunction;
import TemperatureConversor.TemperatureConvertFunction;

// IMPORTS DE JAVAX.SWING
import javax.swing.JOptionPane;

public class Main {

    public static void main (String[] args) {
        CurrencyConvertFunction currency = new CurrencyConvertFunction();
        TemperatureConvertFunction temperature = new TemperatureConvertFunction();

        while(true) {
            String options = (JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversion ", "Menú",
                    JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                            "Conversor de divisas a peso $ ", "Conversor de temperatura ° "},
                     "Selection")).toString();

            switch(options) {
                case "Conversor de divisas a peso $ ":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir: ");

                    if(ValidateNumber(input) == true) {
                        double Minput = Double.parseDouble(input);
                        currency.PesoToCurrency(Minput);
                        int response = JOptionPane.showConfirmDialog(null,
                                "¿Deseas realizar otra conversión ");
                        if (JOptionPane.OK_OPTION == response) {
                            System.out.println("Selecciona opción afirmativa");
                        } else {
                        	JOptionPane.showMessageDialog(null,
                        			"Programa terminado");
                        }
                    } else {
                    	JOptionPane.showMessageDialog(null,
                                    "Valor inválido");
                    }
                    	break;
                        
                        
                    case "Conversor de temperatura ° ":
                        input = JOptionPane.showInputDialog(
                                "Ingresa el valor de la temperatura que deseas convertir ");

                        if(ValidateNumber(input) == true) {
                            double Minput = Double.parseDouble((input));
                            temperature.ConvertTemperature(Minput);
                            int response = 0;
                            response = JOptionPane.showConfirmDialog(null,
                                    "¿Desea continuar?");
                            if((response == 0) && (ValidateNumber(input) == true)) {
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Programa terminado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Valor inválido");
                        }
                        break;
                }
            }
        
        }

        public static boolean ValidateNumber(String input) {
            try {
                double x = Double.parseDouble(input);
                if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

    }


        
