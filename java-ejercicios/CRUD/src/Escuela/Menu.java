
package Escuela;

import java.util.Scanner;

public class Menu {
    private int opcion;
    
    public int eleccion(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("-- Menu (Opciones del 1 al 5) --");
        System.out.println("1. Mostrar datos");
        System.out.println("2. Ingresar datos");
        System.out.println("3. Modificar datos");
        System.out.println("4. Eliminar datos");
        System.out.println("5. Salir");
        opcion=entrada.nextInt();
        
        return opcion;
    }
}
