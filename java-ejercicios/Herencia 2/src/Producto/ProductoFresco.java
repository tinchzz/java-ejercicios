package Producto;

import java.util.Scanner;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String nombre, String fechaVencimiento, int numLote, int precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha Envasado: "+fechaEnvasado+"\nPais de Origen: "+paisOrigen+"\nFecha de Vencimiento: "+getFechaVencimiento()+"\nNumero de Lote: "+getNumLote()+"\nPrecio: "+getPrecio());
        System.out.println("");
    }
    public void modificarpaisOrigen() {
        Scanner entrada=new Scanner(System.in);
        String newpaisOrigen;
        System.out.println("Ingrese Pais de Origen");
        newpaisOrigen = entrada.nextLine();
        
        paisOrigen = newpaisOrigen;
        mostrarDatos();
    }
    public void modificarEnvasado() {
        Scanner entrada=new Scanner(System.in);
        String newEnvasado;
        System.out.println("Ingrese nueva fecha de envasado");
        newEnvasado = entrada.nextLine();
        
        fechaEnvasado = newEnvasado;
        mostrarDatos();
    }
    

}
