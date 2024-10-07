
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


public class Espesificaciones {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("las Espesificaciones de cada bebida son: ");
          
            System.out.println("1 Coca-Cola Original");
              System.out.println(" Agua carbonatada, azúcar, colorante E-150d, acidulante E-338, aromas naturales y cafeína");
          System.out.println("2 Coca-Cola Zero");
              System.out.println(" Agua carbonatada, edulcorantes, colorante E-150d, acidulante E-338, aromas naturales, cafeína");
          System.out.println("3 Coca-Cola Light");
              System.out.println("Agua carbonatada, azúcar, extracto de hoja de stevia, colorante E-150d, acidulante E-338, aromas naturales, cafeína.");
          System.out.println("4 Sprite");
              System.out.println("Agua carbonatada, azúcar, ácido cítrico, aromas naturales de limón y lima, conservante");
          System.out.println("5 powerade");
              System.out.println("Agua, azúcares añadidos, ácido cítrico, citrato de potasio,cloruro de magnesio, cloruro de calcio, vitaminas B3, B6 y B12, colorantes"); 
             System.out.println("6 monster energy");
              System.out.println("Agua carbonatada, sacarosa, glucosa, taurina, citrato de sodio, extracto de raíz de Panax"); 
              
       System.out.println("Seleccione una de las opcciones:");         
    System.out.println("1. Agregar Espesificacion");
    System.out.println("2. Modificar una Espesificacion");
    System.out.println("3. Eliminar una Espesificacion ");
    
  int opcion = 0;
        File E = new File("archivo_texto.txt");
   switch (opcion) {
       
            
            case 1:
                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(E, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Nombre Producto|Nueva Espesificacion \n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
     case 2: 
                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(E);
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
                        FileReader fr = new FileReader(E);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        java.io.FileWriter fw = new java.io.FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("Espesificacion") != 0) {
                                bw.write(linea+"\n");
                            }
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), E.toPath(), REPLACE_EXISTING);
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