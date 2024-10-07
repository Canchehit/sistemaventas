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

public class Categorias1 {

 
    Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
    System.out.println("Categorias en exitencia");
       
    System.out.println("Sodas carbonatadas");
          System.out.println("Sodas");
       System.out.println("Enregisantes");
    
        System.out.println("Seleccione una de las opcciones:");    
      int opcion = 0;
        File G = new File("archivo_texto.txt");
    System.out.println("1. Agregar Categoria");
    System.out.println("2. Modificar una categoria Categoria");
    System.out.println("3. Eliminar Categoria");
    
   switch (opcion) {
       
            
            case 1:
                    try {
                        FileWriter fw = new FileWriter(G, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Nombre|Descripccion\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
     case 2: 
                    try {
                        FileWriter fw = new FileWriter(G);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        bw.write("Sodas carbonatadas|Descripccion|\n");
                        bw.write("Sodas|Descripccion|\n");
                        bw.write("Enregisantes|Descripccion|\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
        
            case 3: 
                 
                    try {
                        FileReader fr = new FileReader(G);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        FileWriter fw = new FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("Categoria") != 0) {
                                bw.write(linea+"\n");
                            }
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), G.toPath(), REPLACE_EXISTING);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

