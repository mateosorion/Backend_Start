import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro Libro1 = new Libro(93445,"La familia adams",562,"Gabo",false);

        Libro1.consultarLibro();
        Libro1.prestar();
        Libro1.consultarLibro();
        Libro1.devolver();
        Libro1.consultarLibro();
        Libro1.imprimir(2.3);

        Libro Libro2 = new Libro();

        Libro2.setIsbn(4598);
        Libro2.setTitulo("Juanito y su mujer");
        Libro2.setNumPaginas(642);
        Libro2.setAutor("Rafael Pombo");

        Libro2.consultarLibro();
        Libro2.prestar();
        Libro2.consultarLibro();
        Libro2.devolver();
        Libro2.consultarLibro();
        Libro2.imprimir(2.3);

        Libro Libro3 = new Libro();

        System.out.println("Ingrese el isbn del libro");
        Libro3.setIsbn(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        Libro3.setTitulo(leer.nextLine());
        System.out.println("Ingrese el numero de paginas del libro");
        Libro3.setNumPaginas(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        Libro3.setAutor(leer.nextLine());

        Libro3.consultarLibro();
        Libro3.prestar();
        Libro3.consultarLibro();
        Libro3.devolver();
        Libro3.consultarLibro();
        Libro3.imprimir(2.3);


        }
    }

