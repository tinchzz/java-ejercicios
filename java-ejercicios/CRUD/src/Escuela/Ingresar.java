package Escuela;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ingresar {
    Scanner entrada=new Scanner(System.in);
    
    PreparedStatement ps;
    
    String nombre, apellido;
    int edad, resultado;
    
    public void ingresar(){
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();

            System.out.println("-- Ingreso de alumnos --");
            entrada.nextLine();
            System.out.println("Ingresar nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingresar apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Ingresar edad: ");
            edad = entrada.nextInt();

            ps = conexion.prepareStatement("insert into alumno (nombre, apellido, edad)values(?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);

            resultado = ps.executeUpdate();

            if(resultado>0){
                System.out.println("Registro ingresado");
            }
            else {
                System.out.println("No se pudo ingresar");
            }
        } catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
}
