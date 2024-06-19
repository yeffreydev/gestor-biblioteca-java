package Clases;

import java.time.LocalDate;

public class Libro extends ItemBiblioteca {

    private int paginas;
    private String isbn;

    public Libro() {

    }

    public Libro(int nPaginas, String isbn, String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        super(titulo, autor, fechaPublicacion, disponibilidad, genero);
        this.paginas = nPaginas;
        this.isbn = isbn;
    }

    public Libro(int nPaginas, String isbn, int id, String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        super(id, titulo, autor, fechaPublicacion, disponibilidad, genero);
        this.paginas = nPaginas;
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNpaginas(int nPaginas) {
        this.paginas = nPaginas;
    }

    public int getNpagina() {
        return paginas;
    }

}
