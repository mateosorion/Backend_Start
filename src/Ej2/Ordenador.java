package Ej2;
public class Ordenador {

    private String marca;
    private String modelo;
    private int ram = 4;
    private int disco = 50;
    private int espacioUsado;
    private boolean encendido = false;

    public Ordenador() {
    }

    public Ordenador(int ram) {
        this.ram = ram;
    }

    public Ordenador(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
    }

    public Ordenador(String marca, String modelo, int ram, int disco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.disco = disco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram % 2 == 0) {
            this.ram = ram;
        } else {
            System.out.println("La RAM es incorrecta");
        }
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public int getEspacioUsado() {
        return espacioUsado;
    }

    public void setEspacioUsado(int espacioUsado) {
        this.espacioUsado = espacioUsado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
                ", espacioUsado=" + espacioUsado +
                ", encendido=" + encendido +
                '}';
    }

    public void encender(){
        this.encendido = true;
    }

    public void apagar () {
        this.encendido = false;
    }

    public void transferirArch (int numGigas) {
        if (this.encendido) {
            if (numGigas < (disco-espacioUsado)) {
                espacioUsado += numGigas;
            }else{
                System.out.println("No hay espacio disponible, el espacio actual es: " + (disco-espacioUsado));
            }
        }else {
            System.out.println("No hay ningun ordenador encendido para realizar la acción");
        }
    }

    public void eliminarArch (int numGigas) {
        if (this.encendido) {
            if (numGigas > espacioUsado) {
                espacioUsado = 0;
            }else {
                espacioUsado -= numGigas;
            }
        }else {
            System.out.println("No hay ningun ordenador encendido para realizar la acción");
        }
    }
}


