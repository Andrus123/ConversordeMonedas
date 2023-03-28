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
public class ConvertirTemperatura {
    
    public void FahrenheitACelsius(double valor) {
        double celsius = (valor - 32)* 5 / 9;
        celsius = (double) Math.round(celsius * 100) / 100;
        JOptionPane.showMessageDialog(null, valor + " °F == "+ celsius + " °C");
    }
    
    public void CelsiusAFahrenheit(double valor) {
        double fahrenheit = valor * 9/5 + 32;
        fahrenheit = (double) Math.round(fahrenheit * 100) / 100;
        JOptionPane.showMessageDialog(null, valor + " °C == "+ fahrenheit+" °F");
    }
}
