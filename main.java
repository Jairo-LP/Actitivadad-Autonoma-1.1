import java.util.*;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String nombre;
        double salario;

        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
        
        JOptionPane.showMessageDialog(null, "El usuario \n" +nombre+ "\nGana" +salario );
    }

}