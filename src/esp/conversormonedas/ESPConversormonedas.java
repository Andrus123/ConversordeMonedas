/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esp.conversormonedas;
import conversortemperatura.FunctionTemperatura;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Aquin
 */
public class ESPConversormonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        function monedas = new function();
        FunctionTemperatura temperatura = new FunctionTemperatura();

        boolean flag = true;
        while (flag) {
            String opciones = (JOptionPane.showInputDialog(null,
                    "Seleccione una opcion de conversion ",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de Moneda", "Conversor de Temperatura"},
                    "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas regresar otra conversion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opcion Afirmativa");
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }
                        break;
                
                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.convertirTemperatura(Minput);
                        
                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
                        if((respuesta==0) && (ValidarNumero(input)==true)) {
                            
                        } else {
                            flag = false;
                            JOptionPane.showConfirmDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }
                    break;
            }
        }
    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
