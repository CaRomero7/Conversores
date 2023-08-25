package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public double ConversorCelsiusAFahrenheit(double valor) {
		double CelsiusFahrenheit = valor * 1.8 + 32;
		CelsiusFahrenheit = (double) Math.round(CelsiusFahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +CelsiusFahrenheit+ " Grados Fahrenheit ");
		return CelsiusFahrenheit;
	}
	
	public void ConversorCelsiusAKelvin(double valor){
		double CelsiusKelvin = valor + 273.15;
        CelsiusKelvin = (double) Math.round(CelsiusKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +CelsiusKelvin+ " Kelvin");
	}
	
	public void ConversorFahrenheitACelsius(double valor) {
		double FahrenheitCelsius = (valor - 32) / 1.8;
        FahrenheitCelsius = (double) Math.round(FahrenheitCelsius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit son: " +FahrenheitCelsius+ " Celsius");
	}
	
	public void ConversorFarenheitAKelvin(double valor) {
		double FarenheitKelvin = (valor - 32) * 0.5556 + 273.15;
		FarenheitKelvin	= (double) Math.round(FarenheitKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Kelvin son: " +FarenheitKelvin+ " Kelvin");
	}
	
	public double ConversorKelvinACelsius(double valor) {
		 double KelvinCelsius = valor - 273.15;
         KelvinCelsius = (double) Math.round(KelvinCelsius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Grados Kelvin son: " +KelvinCelsius+ " Celsius");
         return KelvinCelsius;
	}
	
	public void ConversorKelvinAFarenheit(double valor) {
		double KelvinFarenheit = (valor - 273.15) * 1.8 + 32;
		//double kelvinFarenheit = ConvertirKelvinACelsius(valor);
		//kelvinFarenheit = ConvertirCelsiusAFarenheit(kelvinFarenheit);
		KelvinFarenheit	= (double) Math.round(KelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Kelvin son: " +KelvinFarenheit+ " Fahrenheit");
	}
}
