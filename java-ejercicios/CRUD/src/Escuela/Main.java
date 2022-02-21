
package Escuela;

public class Main {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Leer leer=new Leer();
        Modificar modificar=new Modificar();
        Ingresar ingresar= new Ingresar();
        Eliminar eliminar= new Eliminar();
        int opcion=0;
        
        while(opcion!=5){
            opcion=menu.eleccion();
            
            switch(opcion){
                case 1:{
                    leer.leerTabla();
                    break;
                }
                case 2:{
                    ingresar.ingresar();
                    break;
                }
                case 3:{
                    modificar.modificar();
                    break;
                }
                case 4:{
                    eliminar.eliminar();
                    break;
                }
                case 5:{
                    break;
                }
                default: {
                    System.out.println("Ingrese una opción correcta");
                }
            }
        }
    }
}
