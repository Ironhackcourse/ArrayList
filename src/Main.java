import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> listadoElegidos = new ArrayList<>();

        // Crear la lista inicial (5 personas)
        listadoElegidos.add("Ada Lovelace");
        listadoElegidos.add("Neil Armstrong");
        listadoElegidos.add("Marie Curie");
        listadoElegidos.add("Carl Sagan");
        listadoElegidos.add("Valentina Tereshkova");

        System.out.println("Lista inicial:");
        System.out.println(listadoElegidos);

        // Los puestos 2 y 3 se dan de baja
        // (índices 1 y 2)
        listadoElegidos.remove(2); // primero el índice mayor
        listadoElegidos.remove(1);

        // Entra personaje X en el puesto 2
        String personajeX = "Stephen Hawking";
        listadoElegidos.add(1, personajeX);

        System.out.println("\nTras las bajas y la entrada de X:");
        System.out.println(listadoElegidos);

        // La última persona se pone enferma
        // y recomienda a personaje Y
        String personajeY = "Rosalind Franklin";
        int ultimoIndice = listadoElegidos.size() - 1;

        listadoElegidos.set(ultimoIndice, personajeY);

        System.out.println("\nTras sustituir al último por Y:");
        System.out.println(listadoElegidos);

        // Se añade personaje Z al puesto vacante (puesto 3)
        String personajeZ = "Alan Turing";
        listadoElegidos.add(2, personajeZ);

        System.out.println("\nTras añadir a Z en el puesto 3:");
        System.out.println(listadoElegidos);

        // Buscar una persona
        String buscar = "Stephen Hawking";
        boolean encontrado = listadoElegidos.contains(buscar);

        System.out.println("\n¿Está " + buscar + " en la lista? " + encontrado);

        // Mostrar lista final
        System.out.println("\nLista final de asistentes:");
        System.out.println(listadoElegidos);
    }
}