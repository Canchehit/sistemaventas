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


public class Registro {
    public static void main(String[]args){
    System.out.println("Los codigos de cada producto son:");
    
     System.out.println("CocaColaOriginal = 123");
      System.out.println("CocaColaZero = 456");
       System.out.println("Sprite = 789");
        System.out.println("CocaColaLight = 1011");
         System.out.println("monsterEnergy = 1213");
int CocaColaOriginal = 123;
 int CocaColaZero = 456;
 int Sprite = 789;
 int CocaColaLight = 1011;
 int monsterEnergy = 1213;
          
  System.out.println("Seleccione una de las opcciones:");         
  System.out.println("1. Actualizar una la cantidad de Stock");

    
     int opcion = 0;
   File R = new File("archivo_texto.txt");
    System.out.println("Seleccione 1 para Actualizar"); 
    
   switch (opcion) {
     
            case 1:
                
                     try {
                        FileReader fr = new FileReader(R);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        java.io.FileWriter fw = new java.io.FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("Stock") == 0) {
                                linea = "Soda Carbonatada|CocaColaOriginal|2000";
                            }
                            
                            bw.write(linea+"\n");
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), R.toPath(), REPLACE_EXISTING);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    break;
                }
   
       
    
   
}
}
