import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Movimientos_Stock {
      public static void exportToCSV(String fileName, List<String[]> data) throws IOException {
       Scanner sc = new Scanner(System.in);
          System.out.println("ingresa un Numero del 1 al 6");
    
    //Esta funcion nos sirve para seleccionar el producto
        
  int fechaDeCreacion = (int) (Math.random() * 9000) + 1000;
  int hora = (int) (Math.random() * 9000) + 1000;        
  int producto = 0;
  int valor  = 0;
   String usuario = null;    
   try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String[] row : data) {
                writer.println(String.join(",", row));
            }
          switch(producto){
             
              case 1:
                   System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Original");
              System.out.println("cantida de stock disponibles:");
            System.out.println("2000");
             System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);
                   System.out.println( "Valor de Stock:"+valor);
                   System.out.println( "El usuario:"+usuario);
              break;
              case 2: 
                   System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Zero");
               System.out.println("cantida de stock:");
                System.out.println("500"); 
                 System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);
                System.out.println( "Valor de Stock:"+valor);
                System.out.println( "El usuario:"+usuario);
              break;
              case 3: 
                     System.out.println("Sodas");
              System.out.println("Coca-Cola Light");
              System.out.println("cantida de stock:");
                        System.out.println("600");
                  System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);
                    System.out.println( "Valor de Stock:"+valor);
                    System.out.println( "El usuario:"+usuario);
              break;
              case 4: 
                   System.out.println("Sodas carbonatadas");
              System.out.println("Sprite");
              System.out.println("cantida de stock:");
                    System.out.println("1000");
                 System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);
                     System.out.println( "Valor de Stock:"+valor);
                     System.out.println( "El usuario:"+usuario);
              break;
              case 5: 
                  System.out.println("Enregisantes");
              System.out.println("powerade");
              System.out.println("cantida de stock:");
                             System.out.println("1000");
                    System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);        
                    System.out.println( "Valor de Stock:"+valor);
                    System.out.println( "El usuario:"+usuario);
                    
              break;
              case 6: 
                  System.out.println("Enregisantes");
              System.out.println("monster energy");
               System.out.println("cantida de stock:");
                            System.out.println("1000");
                    System.out.println( "la fecha:"+fechaDeCreacion);
             System.out.println( "la hora:"+hora);        
                     System.out.println( "Valor de Stock:"+valor);
                     System.out.println( "El usuario:"+usuario);
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
          }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
