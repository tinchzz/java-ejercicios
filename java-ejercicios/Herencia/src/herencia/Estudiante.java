
package herencia;

import java.util.Scanner;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre,apellido,edad);
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal=notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+getApellido()+"\nEdad: "+getEdad()+"\nCódigo Estudiante: "+codigoEstudiante+"\nNota Final: "+notaFinal);
    }
    public void cambiarNota(){
        Scanner entrada=new Scanner(System.in);
        float nota;
        System.out.println("Nota final?");
        nota = entrada.nextFloat();
        
        notaFinal = nota;
        if(nota>=7.5){           
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+getApellido()+"\nEdad: "+getEdad()+"\nCódigo Estudiante: "+codigoEstudiante+"\nNota Final: "+notaFinal);
        }
        else{
            System.out.println("La nota no es mayor a 7.5, es: "+notaFinal);
        }
    }
}
