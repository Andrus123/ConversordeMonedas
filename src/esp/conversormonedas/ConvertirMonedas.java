/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esp.conversormonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Aquin
 */
public class ConvertirMonedas {
    
    
    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = valor / 3739.00;
        monedaDolar  = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+" Dolares.");
    }
    
    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor / 4050.48;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuro+" Euros.");
    }
    
    public void ConvertirPesosAYen(double valor) {
        double monedaYen = valor / 43435;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+monedaYen+" Yenes.");
    }
    
    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor / 8758.00;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+monedaLibra+ " Libras.");
    }
    
    public void ConvertirPesosARublos(double valor) {
        double monedaRublos = valor / 7345.00;
        monedaRublos = (double) Math.round(monedaRublos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+monedaRublos+ " Rublos.");
    }
}
