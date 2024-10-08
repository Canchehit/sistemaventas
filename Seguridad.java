
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Seguridad {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese un numero dependiendo su puesto");
      System.out.println("Ingrese el número 1 si es  jefe");
       System.out.println("Ingrese el número 2 si es  Administrador");
        System.out.println("Ingrese el número 3 si es  Vendedor");
   // Contraseñas      
   int jefe = 2465;
   int administrador = 4535;
   int vendedor = 7832;
           
        File M = new File("archivo_texto.txt");     
            int opcion = 0;
        switch (opcion) {
            case 1: 
     System.out.println("INGRESE LA CONTRASEÑA:");           
                if (jefe == 2465){
     System.out.println("Tiene acceso a todos los modulos los cuales son;");
      System.out.println("Gestión de productos");
       System.out.println("Control de existencias");
        System.out.println("Pedidos de compra");
          System.out.println("Informes y estadísticas");
    
                }else{
                    if (jefe < 2465){
                  System.out.println("Contraseña incorrecta");       
                    }
                }
            case 2:
                 System.out.println("INGRESE LA CONTRASEÑA:");    
                 if (administrador  == 4535){
     System.out.println("Tiene acceso a los siguientes modulos los cuales son;");
      System.out.println("Gestión de productos");
       System.out.println("Control de existencias");
        System.out.println("Pedidos de compra");
             
                }else{
                    if (administrador < 4535){
                  System.out.println("Contraseña incorrecta");       
                    }
                }
            case 3:
                 System.out.println("INGRESE LA CONTRASEÑA:");    
                  if (vendedor  == 7832){
     System.out.println("Tiene acceso a los siguientes modulos los cuales son;");
      System.out.println("Gestión de productos");
        System.out.println("Pedidos de compra");
             
                }else{
                    if (vendedor < 7832){
                  System.out.println("Contraseña incorrecta");       
                    }
                }
             
}
}
}