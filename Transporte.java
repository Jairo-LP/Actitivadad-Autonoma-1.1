//meidnate la edad calcular el boleto del avion, menor de edad mitad de precio
//<18 50%, >=64 75%

//calcular valor del transporte terrestres por km
//<= 100 km $5 <=200 %7,50, >=200 $10
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Transporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        double edad =0;
         do {
            System.out.println("===MENU PRINCIPAL=== \n1. Boleto de Avion \n2. Transporte Terrestre \n3. Salir \n ===Selecciona una Opcion===");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad"));
                    if (edad < 18) {
                        JOptionPane.showMessageDialog(null, "El boleto del avion cuesta: " + 50);
                    } else if (edad >= 64) {
                        JOptionPane.showMessageDialog(null, "El boleto del avion cuesta: " + 25);
                    } else {
                        JOptionPane.showMessageDialog(null, "El boleto del avion cuesta: " + 100);
                    }
                    break;
                 case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    break;
            }


         }while (menu !=3);
    }
}
