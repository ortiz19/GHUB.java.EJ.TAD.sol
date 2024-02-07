package miPrincipal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Utilizamos try-with-resources para asegurarnos de que el Scanner se cierre correctamente
        try (Scanner consola = new Scanner(System.in)) {
            int opc = 0; // Variable para almacenar la opción seleccionada por el usuario
            System.out.println("BIENVENIDO"); // Mensaje de bienvenida
            do {
                // Menú principal
                System.out.println("*************************");
                System.out.println("TIPOS ABSTRACTOS DE DATOS");
                System.out.println("*************************");
                System.out.println("1) RATIONAL");
                System.out.println("2) CONJUNTO");
                System.out.println("            ");
                System.out.println("0) SALIR");
                System.out.print("Selecciona opción:");
                opc = consola.nextInt(); // Lee la opción seleccionada por el usuario

                // Manejo de las opciones seleccionadas por el usuario
                switch (opc) {
                    case 1:
                        AppRational.menu(); // Llama al menú de la clase AppRational si se selecciona la opción 1
                        break;
                    case 2:
                        AppConjunto.menu(); // Llama al menú de la clase AppConjunto si se selecciona la opción 2
                        break;
                    case 0:
                        System.out.println("ADIOS!"); // Mensaje de despedida si se selecciona la opción 0
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                        // Mensaje de error para opciones no válidas
                }

            } while (opc != 0); // El bucle se ejecuta hasta que se seleccione la opción de salida (0)
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            // Captura y manejo de cualquier excepción que ocurra durante la ejecución del programa
        }
    }
}
