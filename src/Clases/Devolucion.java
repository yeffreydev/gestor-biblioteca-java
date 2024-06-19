/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author Angel
 */
public class Devolucion {
    private int id;
    private Usuario usuario;
    private Empleado registrador;
    private LocalDate fecha;
    private ItemBiblioteca item;
    private String tipoItem;

    public Devolucion(Usuario usuario, Empleado registrador, LocalDate fecha, ItemBiblioteca item, String tipoItem) {
        this.usuario = usuario;
        this.registrador = registrador;
        this.fecha = fecha;
        this.item = item;
        this.tipoItem = tipoItem;
    }

    public Devolucion(int id, Usuario usuario, Empleado registrador, LocalDate fecha, ItemBiblioteca item, String tipoItem) {
        this.id = id;
        this.usuario = usuario;
        this.registrador = registrador;
        this.fecha = fecha;
        this.item = item;
        this.tipoItem = tipoItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Empleado registrador) {
        this.registrador = registrador;
    }

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empleado getSecretario() {
        return registrador;
    }

    public void setSecretario(Empleado registrador) {
        this.registrador = registrador;
    }

   
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public void setItem(ItemBiblioteca item) {
        this.item = item;
    }
    
    
}
