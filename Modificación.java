
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Modificación {
    
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.println("Lista de productos en extistencia");
            
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
              
  File M = new File("archivo_texto.txt");
       try {
                        java.io.FileWriter fw = new java.io.FileWriter(M);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        bw.write("Coca-Cola Original|Es una vebida alta en azucar |2000\n");
                        bw.write("Coca-Cola Zero|Es una vebida sin azucar |1000\n");
                        bw.write("Coca-Cola Light|Es una vebida con poca azucar |500\n");
                        bw.write("Sprite|Es una vebida con sabor a limon|1000\n");
                        bw.write("powerade|Es una vebida idratante |1000\n");
                        bw.write("monster energy|Es una vebida eneregetica |1000\n");
                        
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
    

}
}
