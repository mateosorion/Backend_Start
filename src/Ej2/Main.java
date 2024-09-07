package Ej2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ordenador Asus = new Ordenador("Asus","Zenbook",8,256);

        Asus.transferirArch(50);
        Asus.eliminarArch(30);
        Asus.encender();
        Asus.transferirArch(50);
        System.out.println(Asus.getEspacioUsado());
        Asus.eliminarArch(30);
        System.out.println(Asus.getEspacioUsado());
        Asus.transferirArch(300);
        System.out.println(Asus.getEspacioUsado());
        Asus.eliminarArch(500);
        System.out.println(Asus.getEspacioUsado());
        Asus.apagar();




    }
}
