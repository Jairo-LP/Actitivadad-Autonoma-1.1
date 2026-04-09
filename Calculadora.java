import java.util.*;
public class Calculadora {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int menu =0;
   do {
        System.out.println("===MENU PRINCIPAL=== \n1. Grados Farenheit \n2. IVA \n3. Salir \n ===Selecciona una Opcion===");
        menu = sc.nextInt();
        switch (menu) {
            
            case 2:
                System.out.println("Ingrese el precio del producto");
                double precio = sc.nextDouble();
                double iva = precio * 0.15;
                double total = precio + iva;
                System.out.println("El IVA es: " + iva);
                System.out.println("El precio total con IVA es: " + total);
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida, por favor intente de nuevo.");
        }
   } while (menu !=3);
 }   
}
