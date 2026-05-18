import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el valor del radio:"));
        double area= calcularArea(radio);
        double volimen= calcularVolumen(radio);
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + volimen + " El área del cilindro es: " + area);

    }

    public static double calcularArea(double radio) {
        return 4 * Math.PI * radio * radio;
    }
    public static double calcularVolumen(double radio) {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }
}