
package herencia;

import java.util.Scanner;


public class Main {
public static void main(String [] args){
    Estudiante estudiante=new Estudiante("Federico","Torres",39,123,8.8f);
    
    Estudiante estudiante2=new Estudiante("Martin","Pereyra",18,124,8.7f);
    
    Estudiante estudiante3=new Estudiante("Jorge", "Perez", 21, 125,8.9f);
    
    estudiante.mostrarDatos();
    estudiante2.mostrarDatos();
    estudiante3.mostrarDatos();
        
    Scanner entrada=new Scanner(System.in);
    int preg=0;
    System.out.println("¿Desea cambiar la nota final de un alumno? 1. Si - 2. No");
    preg = entrada.nextInt();
    
    int swit=0;
    System.out.println("De que alumno desea cambiar la nota final?");
    System.out.println("1. "+estudiante.getNombre());
    System.out.println("2. "+estudiante2.getNombre());
    System.out.println("3. "+estudiante3.getNombre());
    swit = entrada.nextInt();
    
    switch(swit){
        case 1:{
            estudiante.cambiarNota();
        } break;
        
        case 2: {
            estudiante2.cambiarNota();
        } break;
        
        case 3: {
            estudiante3.cambiarNota();
        } break;
        
        default: { System.out.println("Ninguna opción es correcta");
        } break;
    }
    }

}
    
