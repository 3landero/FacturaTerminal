package org.rlandero.appfacturas.domain;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private static int uiltimoCodigo;


    public Producto() {
        this.codigo = ++uiltimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
