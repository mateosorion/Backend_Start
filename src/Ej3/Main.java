package Ej3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", "Perez", "juanperez@gmail.com", 12345678, "DNI", 30,
                1122334455, "Masculino", "Calle Falsa 123"));  //Agregar

        personas.add(new Persona("Maria", "Gomez", "mariagomez@gmail.com", 87654321, "DNI", 25,
                1122334455, "Femenino", "Calle Falsa 123"));  //Agregar

        System.out.println("Persona: " + personas.get(0));  //Obtener
        System.out.println("Persona: " + personas.get(1));  //Obtener

        personas.remove(0);  //Eliminar.

        System.out.println("Persona: " + personas.get(0));  //Obtener

        personas.add(0, new Persona("Pedro", "Gonzalez", "pedrogonzales@gmail.com", 12345678, "DNI", 30,
                1122334455, "Masculino", "Calle Falsa 123"));  //Agregar en posicion especifica

        System.out.println("Persona: " + personas.get(0));  //Obtener
        System.out.println("Persona: " + personas.get(1));  //Obtener

        personas.set(1, new Persona("Jose", "Romualdo", "joseromualdo@gmail.com", 12345678, "DNI", 30,
                1122334455, "Masculino", "Calle Falsa 123"));  //Modificar

        System.out.println("Persona: " + personas.get(0));  //Obtener
        System.out.println("Persona: " + personas.get(1));  //Obtener


    }
}
