import java.io.BufferedInputStream;
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

/**
 *
 * @author luisa
 */
public class caracteristicas {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("las caracteristicas de cada bebida son: ");
          
         System.out.println("1 Coca-Cola Original");
              System.out.println("Es una vebida alta en azucar");
          System.out.println("2 Coca-Cola Zero");
              System.out.println("Es una vebida sin azucar");
          System.out.println("3 Coca-Cola Light");
              System.out.println("Es una vebida con poca azucar");
          System.out.println("4 Sprite");
              System.out.println("Es una vebida con sabor a limon");
          System.out.println("5 powerade");
              System.out.println("Es una vebida idratante"); 
             System.out.println("6 monster energy");
              System.out.println("Es una vebida eneregetica");  
              
       System.out.println("Seleccione una de las opcciones:");         
    System.out.println("1. Agregar Espesificacion");
    System.out.println("2. Modificar una Espesificacion");
    System.out.println("3. Eliminar una Espesificacion ");
    
  int opcion = 0;
        File C = new File("archivo_texto.txt");
   switch (opcion) {
       
            
            case 1:
                    try {
                        FileWriter fw = new FileWriter(C, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Nombre Producto|Nueva Caracteristica \n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
     case 2: 
                    try {
                        FileWriter fw = new FileWriter(C);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        bw.write("Coca-Cola Original|Modificar|\n");
                        bw.write("Coca-Cola Zero|Modificar|\n");
                        bw.write("Coca-Cola Light|Modificar|\n");
                        bw.write("Sprite|Modificar|\n");
                        bw.write("powerade|Modificar|\n");
                        bw.write("monster energy|Modificar|\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
        
            case 3: 
                 
                    try {
                        FileReader fr = new FileReader(C);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        FileWriter fw = new FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("Caracteristica") != 0) {
                                bw.write(linea+"\n");
                            }
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), C.toPath(), REPLACE_EXISTING);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    break;
                default: 
                System.out.println("Ingrese una opción válida.");
        }
    }
 }   
   
 