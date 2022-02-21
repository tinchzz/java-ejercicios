package Producto;

import java.util.Scanner;

public class Producto {
    protected String nombre;
    private String fechaVencimiento;
    private int numLote;
    private int precio;

    public Producto(String nombre, String fechaVencimiento, int numLote, int precio) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumLote() {
        return numLote;
    }

    public int getPrecio() {
        return precio;
    }  
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de Vencimiento: "+fechaVencimiento+"\nNumero de Lote: "+numLote+"\nPrecio: "+precio);
    }
}
