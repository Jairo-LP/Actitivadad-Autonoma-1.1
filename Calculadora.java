//hacer un menu con dos opciones
//1. transformar de grados celcius a farhenheit
//calcular el valo real + iva de un producto

import java.util.*;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double gradosC;
        Double gradosF;

        System.out.println("ingrese los grados en celcius:");
        gradosC = sc.nextDouble();

        gradosF = (gradosC * 1.8) +32;
        System.out.println("el equivalente en farenheit es: "+gradosF);
        

        
    }
}

