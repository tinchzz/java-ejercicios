package Producto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductoFresco pf=new ProductoFresco("2-9-2021","","Manzanas","2-10-2025",1,100);
        ProductoRefrigerado pr=new ProductoRefrigerado(1752,"Leche","2-9-2026",2,200);
        ProductoCongelado pc=new ProductoCongelado(-17,"Carne","2-9-2027",3,500);
        pf.mostrarDatos();
        pr.mostrarDatos();
        pc.mostrarDatos();
        
        Scanner entrada=new Scanner(System.in);
        int preg;
        System.out.println("Desea modificar datos de algún producto? 1. Si - 2. No");
        preg = entrada.nextInt();
        switch(preg) {
            case 1: {
                int preg2;
                System.out.println("¿De que producto quiere modificar los datos?");
                System.out.println("1. Productos Frescos");
                System.out.println("2. Productos Refrigerados");
                System.out.println("3. Productos Congelados");
                preg2 = entrada.nextInt();
                switch(preg2){
                    case 1: {
                        int preg3;
                        System.out.println("1. Modificar Pais de Origen");
                        System.out.println("2. Modificar Fecha de Envasado");
                        preg3 = entrada.nextInt();
                        switch (preg3) {
                            case 1: {
                                pf.modificarpaisOrigen();
                            }   break;
                            case 2: {
                                pf.modificarEnvasado();
                            }   break;
                            default: {
                                System.out.println("Ingresa una opción valida");
                            }   break;
                        }
                        
                    } break;
                    case 2: {
                        System.out.println("----- Modificar Código del SENASA -----");
                        pr.modificarcodigoSENASA();
                    } break;
                    case 3: {
                        System.out.println("---- Modificar Temperatura ----");
                        pc.modificarTemperatura();
                    } break;
                }  
            } break;
            case 2: { System.exit(0);
            } break;
            default: {
                System.out.println("Ingresa una opción correcta");
            } break;
        }
        System.out.println("---- Nombre y Precio del producto más caro ---- ");
        int masCaro;
        masCaro = pf.getPrecio();
        
        if(masCaro >= pr.getPrecio()){
            if(masCaro >= pc.getPrecio()){
                System.out.println("El producto más caro es: "+pf.getNombre()+" con el valor de: "+masCaro);
            }
            else {
                System.out.println("El producto más caro es: "+pc.getNombre()+" con el valor de: "+masCaro);
            }
        }
        else {  
            masCaro = pr.getPrecio();
            if (masCaro >= pc.getPrecio()){
                System.out.println("El producto más caro es: "+pr.getNombre()+" con el valor de: "+masCaro);
            }
            else {
                masCaro = pc.getPrecio();
                System.out.println("El producto más caro es: "+pc.getNombre()+" con el valor de: "+masCaro);
            }
        }
        System.out.println("---- Promedio de precios entre todos los productos ----");
        int promedio=0;
        
        promedio = (pf.getPrecio()+pr.getPrecio()+pc.getPrecio())/3;
        System.out.println("El promedio es de: "+promedio);
    }
 
}
