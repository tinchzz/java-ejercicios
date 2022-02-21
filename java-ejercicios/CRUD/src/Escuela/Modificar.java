package Escuela;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Modificar {
    PreparedStatement ps;
    ResultSet rs;
    
    int codigo, edad, resultado;
    String nombre, apellido;
    
    public void modificar(){
        Scanner entrada=new Scanner(System.in);
        
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            
            System.out.println("Ingresar el id del alumno a modificar");
            codigo=entrada.nextInt();
            ps= conexion.prepareStatement("select * from alumno where id="+codigo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                System.out.println(" Codigo: "+rs.getInt("id")+
                        "\n Nombre: "+rs.getString("nombre")+
                        "\n Apellido: "+rs.getString("apellido")+
                        "\n Edad: "+rs.getInt("edad"));
                
                entrada.nextLine();
                System.out.println("Ingresar el nuevo nombre");
                nombre=entrada.nextLine();
                System.out.println("Ingresar el nuevo apellido");
                apellido=entrada.nextLine();
                System.out.println("Ingresar la nueva edad");
                edad=entrada.nextInt();
                
                ps=conexion.prepareStatement("update alumno set nombre=?, apellido=?, edad=? where id=?");
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setInt(3, edad);
                ps.setInt(4, codigo);
                resultado=ps.executeUpdate();
            }
            else {
                System.out.println("No existe el registro");
            }
            conexion.close();
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
}
