package Clases;

import java.time.LocalDate;


public abstract class ItemBiblioteca {

    private int id;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private boolean disponibilidad;
    private String genero;

    public ItemBiblioteca() {
        
    }
    public ItemBiblioteca(String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.disponibilidad = disponibilidad;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    

    public ItemBiblioteca(int id, String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.disponibilidad = disponibilidad;
        this.genero = genero;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublication) {
        this.fechaPublicacion = fechaPublication;
    }

  
}
