package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Seleccione la Opción para Convertir", "Temperatura", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin", 
    					"Grados Farenheit a Grados Celsius", "Grados Farenheit a Grados Kelvin", "Kelvin a Grados Celsius", "Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celsius a Grados Farenheit":
        	temperatura.ConversorCelsiusAFahrenheit(Minput);
        	break;
        case "Grados Celsius a Kelvin":
            temperatura.ConversorCelsiusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celsius":
           temperatura.ConversorFahrenheitACelsius(Minput);
           break;
        case "Grados Farenheit a Grados Kelvin":
            temperatura.ConversorFarenheitAKelvin(Minput);
            break;
        case "Kelvin a Grados Celsius":
           temperatura.ConversorKelvinACelsius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConversorKelvinAFarenheit(Minput);
        	break;
        }
	}
}
    	
     


