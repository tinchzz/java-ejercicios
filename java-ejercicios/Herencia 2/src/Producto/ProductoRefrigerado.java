package Producto;

import java.util.Scanner;

public class ProductoRefrigerado extends Producto {
    private int codigoSENASA;

    public ProductoRefrigerado(int codigoSENASA, String nombre, String fechaVencimiento, int numLote, int precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.codigoSENASA = codigoSENASA;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo del SENASA: "+codigoSENASA+"\nFecha de Vencimiento: "+getFechaVencimiento()+"\nNumero de Lote: "+getNumLote()+"\nPrecio: "+getPrecio());
        System.out.println("");
    }
    public void modificarcodigoSENASA() {
        Scanner entrada=new Scanner(System.in);
        int newSENASA;
        System.out.println("Ingrese Codigo SENASA");
        newSENASA = entrada.nextInt();
        
        codigoSENASA = newSENASA;
        mostrarDatos();
    }
    
}
