/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversortemperatura;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés Aquin
 */
public class FunctionTemperatura {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
    
    public void convertirTemperatura(double temp) {
        String opciones = (JOptionPane.showInputDialog(null,
                "Seleccione valor a convertir", "Temperatura",
                JOptionPane.PLAIN_MESSAGE,null,
                new Object[] {"Celsius a Fahrenheit","Fahrenheit a Celsius"},
                "Seleccion")).toString();
        
        switch (opciones) {
            case "Celsius a Fahrenheit":
                temperatura.CelsiusAFahrenheit(temp);
                break;
                
            case "Fahrenheit a Celsius":
                temperatura.FahrenheitACelsius(temp);
                break;
            default:
                throw new AssertionError();
        }
    }
}
