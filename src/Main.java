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

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Centro de Adopción de Mascotas ***");
            System.out.println("1. Ver mascotas disponibles");
            System.out.println("2. Adoptar una mascota");
            System.out.println("3. Agregar una nueva mascota");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nMascotas disponibles para adopción:");
                    for (Integer id : mascotasDisponibles.keySet()) {
                        System.out.println("ID: " + id + " - " + mascotasDisponibles.get(id));
                    }
                    break;
                case 2:
                    System.out.print("\nIngrese el ID de la mascota que desea adoptar: ");
                    int id = scanner.nextInt();

                    if (mascotasDisponibles.containsKey(id)) {
                        System.out.println("¡Felicidades! Has adoptado a " + mascotasDisponibles.get(id).getNombre());
                        mascotasDisponibles.remove(id);
                    } else {
                        System.out.println("ID inválido o la mascota ya ha sido adoptada.");
                    }
                    break;
                case 3:
                    System.out.print("\n¿Desea agregar un Perro (1) o un Gato (2)? ");
                    int tipoMascota = scanner.nextInt();

                    System.out.print("Ingrese el ID de la nueva mascota: ");
                    int nuevoId = scanner.nextInt();

                    if (mascotasDisponibles.containsKey(nuevoId)) {
                        System.out.println("Ya existe una mascota con ese ID.");
                    } else {
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre de la mascota: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese la edad de la mascota: ");
                        int edad = scanner.nextInt();

                        if (tipoMascota == 1) {
                            System.out.print("Ingrese la raza del perro: ");
                            scanner.nextLine();
                            String raza = scanner.nextLine();
                            mascotasDisponibles.put(nuevoId, new Perro(nombre, edad, raza));
                            System.out.println("Perro agregado con éxito.");
                        } else if (tipoMascota == 2) {
                            System.out.print("Ingrese el color del gato: ");
                            scanner.nextLine();
                            String color = scanner.nextLine();
                            mascotasDisponibles.put(nuevoId, new Gato(nombre, edad, color));
                            System.out.println("Gato agregado con éxito.");
                        } else {
                            System.out.println("Opción inválida.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Gracias por visitar el Centro de Adopción de Mascotas. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();


    }
}