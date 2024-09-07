public class Libro {

    private int isbn;
    private String titulo;
    private int numPaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
    }

    public Libro(int isbn, String titulo, int numPaginas, String autor, boolean prestado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.prestado = false;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    public void prestar (){
        if(!this.isPrestado()){
            this.setPrestado(true);
            System.out.println("Prestamo exitoso");
        }else{
            System.out.println("El libro está prestado");
        }
    }

    public void devolver (){
        if(this.isPrestado()){
            this.setPrestado(false);
            System.out.println("Devuelto correctamente");
        }else{
            System.out.println("El libro no estaba prestado");
        }
    }

    public void imprimir (double costoPagina){
        double costoTotal = costoPagina * numPaginas;
        System.out.println("La impresión del libro cuesta " + costoTotal );
    }

    public void consultarLibro (){
        if(this.isPrestado()){
            System.out.println("El libro " + isbn + " con titulo " + titulo + " y autor " + autor +
            " tiene " + numPaginas + " paginas y está prestado");

        }else{
            System.out.println("El libro " + isbn + " con titulo " + titulo + " y autor " + autor +
            " tiene " + numPaginas + " paginas y no está prestado");

        }

    }
}
