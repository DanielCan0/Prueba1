package laboratoriodos;
import java.util.Scanner;

public class Cano_Daniel_Proyecto1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double EfectivoCaja = 0.0;
        boolean exit = false;

        while (!exit) {
            System.out.println("- - - - Menu Principal - - - -");
            System.out.println("(1) Abrir Caja");
            System.out.println("(2) Ventas");
            System.out.println("(3) Compras");
            System.out.println("(4) Reportes");
            System.out.println("(5) Cierre Caja");
            System.out.println("(6) Salir del Sistema");
            System.out.println("- - - - - - - - - - - - - - - -");

            int option = -1;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Seleccione una opcion: ");
                if (lea.hasNextInt()) {
                    option = lea.nextInt();
                    if (option >= 1 && option <= 6) {
                        validInput = true;
                    } else {
                        System.out.println("Opcion no válida, por favor ingrese un numero entre 1 y 6.");
                    }
                } else {
                    System.out.println("Entrada no valida, por favor ingrese un numero.");
                    lea.next(); // Consumir la entrada no válida
                }
            }

                if (option == 1) {
                    System.out.print("Ingrese la cantidad de efectivo para guardar en la caja: ");
                    double amount = lea.nextDouble();
                    EfectivoCaja += amount;
                    System.out.println("Efectivo agregado exitosamente. Efectivo total en caja: " + EfectivoCaja);
                   } else if (option == 2) {
                    char cliente;
                    System.out.println("Que tipo de cliente sos? A/B/C ");
                    cliente = lea.next().toUpperCase().charAt(0);

                    if (cliente == 'A') {
                    System.out.println("Tiene disponible los productos 1/2/3/4");



                    } else if (cliente == 'B'){
                          System.out.println("Tiene disponible los productos 1/2/3");




                    } else if (cliente == 'C'){
                          System.out.println("Tiene disponible los productos 4");

                      
                      
                      
                } else {
                    System.out.println("Porfavos ingresar una opcion correcta");
                    
                    
                }                       
                  
                
                
                
                
                
                
                
                
                
                
            } else if (option == 3) {
                
            } else if (option == 4) {
                
            } else if (option == 5) {
                
            } else if (option == 6) {
                
                exit = true;
                System.out.println("Saliendo del sistema...");
                
            }
        }

    
    }
}
