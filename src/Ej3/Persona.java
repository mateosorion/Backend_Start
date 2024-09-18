package Ej3;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private int dni;
    private String tipoDni;
    private int edad;
    private int celular;
    private String genero;
    private String direccion;

    public Persona(String nombre, String apellido, String email, int dni, String tipoDni, int edad, int celular, String genero, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.tipoDni = tipoDni;
        this.edad = edad;
        this.celular = celular;
        this.genero = genero;
        this.direccion = direccion;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //to string

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", dni=" + dni +
                ", tipoDni='" + tipoDni + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
