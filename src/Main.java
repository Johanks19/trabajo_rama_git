import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // HashMap
        HashMap<Integer, Mascota> mascotasDisponibles = new HashMap<>();
        mascotasDisponibles.put(1, new Perro("Spike", 3, "Labrador"));
        mascotasDisponibles.put(2, new Gato("Mirringo", 2, "Blanco"));
        mascotasDisponibles.put(3, new Perro("Firulais", 5, "Bulldog"));
        mascotasDisponibles.put(4, new Gato("Garfield", 4, "Naranja"));
        mascotasDisponibles.put(5, new Perro("Orion", 1, "Pastor Alemán"));


    }
}