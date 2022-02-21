package Escuela;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;

public class Leer {
    PreparedStatement ps;
    ResultSet rs;
    
    public void leerTabla(){
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps = conexion.prepareStatement("select * from alumno");
            rs = ps.executeQuery();
            int band=0;
            
            while(rs.next()){
                band=1;
                System.out.println(" Codigo: "+rs.getInt("id")+
                        "\n Nombre: "+rs.getString("nombre")+
                        "\n Apellido: "+rs.getString("apellido")+
                        "\n Edad: "+rs.getInt("edad"));
            }
            if(band==0){
                System.out.println("No existen registros");
            }
            
        }
        catch(Exception ex){
        
        }
    }
}
