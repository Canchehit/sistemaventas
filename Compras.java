
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Compras {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese el numero 1 para generar un Movimiento");
    
          
          
          
          
           File E = new File("archivo_texto.txt");       
   int opcion = 0;
   switch (opcion) {
            case 1: 
                    try {
                        java.io.FileWriter fw = new java.io.FileWriter(E);
                        BufferedWriter bw = new BufferedWriter(fw);
                     
                        bw.write("CocacolaOriginal,Proveedor,producto,azucar,cantidad,3 Qintales,Precio 400 el quintal,Total,1200,0015,fecha,07/10/2024 \n");
                          bw.write("CocaColaZero,Proveedor,producto,azucar,cantidad,5 Qintales,Precio 400 el quintal,Total,2000,0050,fecha,07/10/2024 \n");
                            bw.write("CocaColaLight,Proveedor,producto,azucar,cantidad,2 Qintales,Precio 400 el quintal,Total,800,0035,fecha,12/11/2024 \n");
                              bw.write("Sprite,Proveedor,producto,azucar,cantidad,4 Qintales,Precio 400 el quintal,Total,1600,0017,fecha,17/10/2024 \n");
                                bw.write("Powerade,Proveedor,producto,azucar,cantidad,3 Qintales,Precio 400 el quintal,Total,1200,045,fecha,07/11/2024 \n");
                                  bw.write("monsterEnergy,Proveedor,producto,azucar,cantidad,3 Qintales,Precio 400 el quintal,Total,1200,0025,fecha,25/10/2024 \n");
                                 
                  
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    
                    break;

          
          
          
          
          
          
          
          
          
          
          
}
}
     }
}