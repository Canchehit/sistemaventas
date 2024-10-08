import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

  
public class GeneracionDeInformes {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
          System.out.println("Catalogo de los productos ");
          
           System.out.println("Sodas carbonatadas");
              System.out.println("1Coca-Cola Original");
              System.out.println("cantida de stock disponibles:");
            System.out.println("2000");
                   System.out.println( "Valor de Stock: 600");
                   
          System.out.println("2Coca-Cola Zero");
               System.out.println("cantida de stock:");
                System.out.println("500");        
                System.out.println( "Valor de Stock: 400");
                
          System.out.println("3 Sprite");
              System.out.println("cantida de stock:");
                    System.out.println("1000");
                     System.out.println( "Valor de Stock: 500");
          
           System.out.println("Sodas");
              System.out.println("1 Coca-Cola Light");
              System.out.println("cantida de stock:");
                        System.out.println("600");                    
                    System.out.println( "Valor de Stock: 600");
          
                 System.out.println("Enregisantes");
              System.out.println("1 powerade");
              System.out.println("cantida de stock:");
                             System.out.println("1000");                     
                    System.out.println( "Valor de Stock: 400");    
                    
          System.out.println("2 monster energy");
               System.out.println("cantida de stock:");
                            System.out.println("1000");
                     System.out.println( "Valor de Stock: 500");
          
                      System.out.println( "Seleccione el numero 1 para crear el registro");
         File G = new File("archivo.CSV");              
       int opcion = 0;             
       switch (opcion) {
            case 1: 
                    try {
                        FileWriter fw = new FileWriter(G);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        bw.write("Sodas carbonatadas,Coca-Cola Original,cantida de stock,2000,Valor,600\n");
                        bw.write("Sodas carbonatadas,Coca-Cola Zero,cantida de stock,500,Valor,400\n");
                        bw.write("Sodas carbonatadas,Sprite,cantida de stock,1000,Valor,500\n");
                        bw.write("Sodas ,Coca-Cola Light,cantida de stock,600,Valor,600\n");
                        bw.write("Enregisantes,powerade,cantida de stock,1000,Valor,400\n");
                        bw.write("Enregisantes,monster energy,cantida de stock,1000,Valor,500\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
  
  
              
     
         
    }
}
}
                  
       
    
    

                  
