//meidnate la edad calcular el boleto del avion, menor de edad mitad de precio
//<18 50%, >=64 75%

//calcular valor del transporte terrestres por km
//<= 100 km $5 <=200 %7,50, >=200 $10
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Transporte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double cantKM;
        cantKM = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de kilometros que deseas viajar"));

        if (cantKM <=100) {
            JOptionPane.showMessageDialog(null, "el valor del viaje es $5");
            
        }else if (cantKM <=200) {
            JOptionPane.showMessageDialog(null, "el valor del viaje es $7.5");
            
        }else if (cantKM>=200) {
            JOptionPane.showMessageDialog(null, "el valor del viaje es $10");
        }

       

        



       
    }
}
