package Ej2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ordenador Asus = new Ordenador("Asus","Zenbook",8,256);

        Asus.transferirArch(50);
        Asus.eliminarArch(30);
        Asus.encender();
        String tostring = Asus.toString();
        System.out.println(tostring);
        Asus.transferirArch(50);
        tostring = Asus.toString();
        System.out.println(tostring);
        Asus.eliminarArch(30);
        tostring = Asus.toString();
        System.out.println(tostring);
        Asus.transferirArch(300);
        tostring = Asus.toString();
        System.out.println(tostring);
        Asus.eliminarArch(500);
        tostring = Asus.toString();
        System.out.println(tostring);
        Asus.apagar();
        tostring = Asus.toString();
        System.out.println(tostring);


    }
}
