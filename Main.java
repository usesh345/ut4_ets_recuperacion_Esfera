import javax.swing.*;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        double radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el valor del radio:"));
        double area= calcularArea(radio);
        double volumen = calcularVolumen(radio);
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + volumen + " El área del cilindro es: " + area);

    }

    /**
     * Calcular area double.
     *
     * @param radio the radio
     * @return the double
     */
    public static double calcularArea(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    /**
     * Calcular volumen double.
     *
     * @param radio the radio
     * @return the double
     */
    public static double calcularVolumen(double radio) {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

}