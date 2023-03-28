/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esp.conversormonedas;

/**
 *
 * @author Andrés Aquin
 */
import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double Minput) {
        String option = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", " De Pesos a Yen", "De Pesos a Rublos"},
                "Seleccion")).toString();

        switch (option) {
            case "De Pesos a Dolar":
                monedas.ConvertirPesosADolares(Minput);
                break;
                
            case "De Pesos a Euro" :
                monedas.ConvertirPesosAEuros(Minput);
                break;
                
            case "De Pesos a Libras":
                monedas.ConvertirPesosALibras(Minput);
                break;
                
            case "De Pesos a Yen":
                monedas.ConvertirPesosAYen(Minput);
                break;
                
            case "De Pesos a Rublos":
                monedas.ConvertirPesosARublos(Minput);
                break;
        }
    }
}
