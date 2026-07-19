import java.util.ArrayList;

public class Ejercicio_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Rellenar el ArrayList con los números del 20 al 50
        for (int i = 20; i <= 50; i++) {
            numeros.add(i);
        }

        // Mostrar el ArrayList completo
        System.out.println("Contenido del ArrayList:");
        System.out.println(numeros);
    }
}
