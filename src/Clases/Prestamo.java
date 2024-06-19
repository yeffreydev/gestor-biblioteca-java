package Clases;

import java.time.LocalTime;

/**
 *
 * @author Angel
 */
public class Prestamo {
    private int id;
    private Usuario usuario;
    private Empleado registrador;
    private LocalTime fecha;
    private ItemBiblioteca item;
    private String tipoItem;
    private Devolucion devolucion;
public Prestamo() {}
    public Prestamo(int id, Usuario usuario, Empleado registrador, LocalTime fecha, ItemBiblioteca item,String tipoItem, Devolucion devolucion) {
        this.id = id;
        this.usuario = usuario;
        this.registrador = registrador;
        this.fecha = fecha;
        this.tipoItem = tipoItem;
        this.item = item;
        this.tipoItem = tipoItem;
        this.devolucion = devolucion;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public Empleado getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Empleado registrador) {
        this.registrador = registrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public void setItem(ItemBiblioteca item) {
        this.item = item;
    }

}
