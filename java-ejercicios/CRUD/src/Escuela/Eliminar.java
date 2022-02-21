package Escuela;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Eliminar {
    Scanner entrada=new Scanner(System.in);
    
    PreparedStatement ps;
    int cod, resultado;
    
    public void eliminar(){
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            
            System.out.println("-- Eliminar alumnos --");
            System.out.println("Ingresar código a eliminar");
            cod=entrada.nextInt();
            
            ps=conexion.prepareStatement("delete from alumno where id="+cod);
            resultado=ps.executeUpdate();
            
            if(resultado>0){
                System.out.println("Registro eliminado");
            }
            else {
                System.out.println("No se pudo eliminar el registro");
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
}
