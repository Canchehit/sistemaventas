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


public class Creacion {

 
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
             System.out.println("Productos en exitencia");
      System.out.println("1 CocaColaOriginal");
      System.out.println("2 CocaColaZero ");
      System.out.println("3 CocaColaLight ");
       System.out.println("4 Sprite ");
        System.out.println("5 Powerade ");
         System.out.println("6 monsterEnergy "); 
          System.out.println("Ingrese el número 1 para crear un pedido"); 
          
          
     File E = new File("archivo_texto.txt");       
   int opcion = 0;
   switch (opcion) {
            case 1: 
                    try {
                        FileWriter fw = new FileWriter(E);
                        BufferedWriter bw = new BufferedWriter(fw);
                        int cantidad = 0;
                        int precio = 0;
                        int total = 0;
                        bw.write("CocacolaOriginal|Proveedor|producto|azucar|cantidad|3 Qintales|Precio 400 el quintal|Total|1200 \n");
                          bw.write("CocaColaZero|Proveedor|producto|azucar|cantidad|5 Qintales|Precio 400 el quintal|Total|2000 \n");
                            bw.write("CocaColaLight|Proveedor|producto|azucar|cantidad|2 Qintales|Precio 400 el quintal|Total|800 \n");
                              bw.write("Sprite|Proveedor|producto|azucar|cantidad|4 Qintales|Precio 400 el quintal|Total|1600 \n");
                                bw.write("Powerade|Proveedor|producto|azucar|cantidad|3 Qintales|Precio 400 el quintal|Total|1200 \n");
                                  bw.write("monsterEnergy|Proveedor|producto|azucar|cantidad|3 Qintales|Precio 400 el quintal|Total|1200 \n");
                         int CODIGO = (int) (Math.random() * 9000) + 1000;          
                        total = cantidad * precio;
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    
                    break;

       
 
   }
}
}
}