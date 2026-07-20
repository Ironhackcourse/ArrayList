import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        String respuesta = "";

        System.out.println("Introduce elementos típicos de Sant Jordi.");
        System.out.println("Escribe 'salir' para terminar.");

        while (!respuesta.equalsIgnoreCase("salir")) {

            System.out.print("Elemento: ");
            respuesta = sc.nextLine();

            if (!respuesta.equalsIgnoreCase("salir")) {

            elementos.add(respuesta);
            }
        }

        System.out.println("\nElementos introducidos:");

        for (String elemento : elementos) {
            System.out.println("- " + elemento);
        }

        sc.close();
    }
}
