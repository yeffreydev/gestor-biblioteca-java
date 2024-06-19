package Clases;

import java.time.LocalDate;

public class CD extends ItemBiblioteca {

    String duracion;
public CD() {
    
}
    public CD(String duracion, String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        super(titulo, autor, fechaPublicacion, disponibilidad, genero);
        this.duracion = duracion;
    }

    public CD(String duracion, int id, String titulo, String autor, LocalDate fechaPublicacion, boolean disponibilidad, String genero) {
        super(id, titulo, autor, fechaPublicacion, disponibilidad, genero);
        this.duracion = duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

   
}
