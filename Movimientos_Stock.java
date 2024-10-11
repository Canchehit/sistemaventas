import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimientos_Stock {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese el numero 1 para ver los Movimientos");
          System.out.println("Ingrese el numero 2 agregar Movimientos");

          File M = new File("archivo.CSV");     
            int opcion = 0;
        switch (opcion) {
            case 1: 
                    try {
                        FileWriter fw = new FileWriter(M);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                      bw.write("Sodas carbonatadas,Coca-Cola Original,cantida de stock,2000,Valor,600,fecha,07/10/2024,21:24,Usuario,Jose\n");
                        bw.write("Sodas carbonatadas,Coca-Cola Zero,cantida de stock,500,Valor,400,fecha,06/10/2024,01:24,Usuario,Jose\n");
                        bw.write("Sodas carbonatadas,Sprite,cantida de stock,1000,Valor,500,fecha,07/10/2024,21:24,Usuario,Jose\n");
                        bw.write("Sodas ,Coca-Cola Light,cantida de stock,600,Valor,600,fecha,03/10/2024,02:24,Usuario,Mario\n");
                        bw.write("Enregisantes,powerade,cantida de stock,1000,Valor,400,fecha,07/10/2024,21:24,Usuario,Jose\n");
                        bw.write("Enregisantes,monster energy,cantida de stock,1000,Valor,500,fecha,03/10/2024,02:24,Usuario,Mario\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            case 2:
                    try {
                        FileWriter fw = new FileWriter(M, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Categoria|Producto|Stock|Cantidad|Valor|Cantidad|Fecha|hora|Usuario|Nombre\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
          }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

