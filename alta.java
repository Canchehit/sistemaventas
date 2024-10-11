
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class alta {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Lista de productos en extistencia");
  
System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Original");
              System.out.println("Coca-Cola Zero");
              System.out.println("Sprite");
System.out.println("Sodas");
              System.out.println("Coca-Cola Light");
              
System.out.println("Enregisantes");
              System.out.println("monster energy");
              System.out.println("powerade");
              
    System.out.println("Seleccione una de las opcciones:");         
  System.out.println("1. Escribir registro");
    
   
  int opcion = 0;
        File A = new File("archivo_texto.txt");
   switch (opcion) {
       
            
            case 1:
                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(A, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Sodas carbonatadas| Coca-Cola Original|Es una vebida alta en azucar |2000  \n");
                        bw.write("Sodas carbonatadas| Coca-Cola Zero|Es una vebida sin azucar |1000  \n");
                        bw.write("Sodas carbonatadas| Sprite|Es una vebida con sabor a limon |1000  \n");
                        bw.write("Sodas| Coca-Cola Light|Es una vebida con poca azucar |500  \n"); 
                        bw.write("Enregisantes| monster energy|Es una vebida eneregetica |1000  \n");
                        bw.write("Enregisantes| powerade|Es una vebida idratante |1000  \n");
                        bw.close();
                    System.out.println("Archivo Guardado");   
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                   case 2: 
                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(A);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        bw.write("Categorias|Producto|Descripccion|Producto|Cantidad de Stock\n");
                      
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
  
        }
    }
        
         
    }
 


















   
    