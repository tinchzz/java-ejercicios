package Producto;

import java.util.Scanner;

public class ProductoCongelado extends Producto {
    private int temperaturaRecomendada;

    public ProductoCongelado(int temperaturaRecomendada, String nombre, String fechaVencimiento, int numLote, int precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Temperatura Recomendada: "+temperaturaRecomendada+"\nFecha de Vencimiento: "+getFechaVencimiento()+"\nNumero de Lote: "+getNumLote()+"\nPrecio: "+getPrecio());
        System.out.println("");
    }
    public void modificarTemperatura() {
        Scanner entrada=new Scanner(System.in);
        int newTemperatura;
        System.out.println("Ingrese Temperatura");
        newTemperatura = entrada.nextInt();
        
        temperaturaRecomendada = newTemperatura;
        mostrarDatos();
    }

}
