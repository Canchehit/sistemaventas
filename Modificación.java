
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Modificación {
    
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Lista de productos en extistencia");
  
  //Esta funcion nos sirve para seleccionar el producto
  int producto = 0;
          switch(producto){
             
              case 1:
              System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Original");
              System.out.println("Coca-Cola Zero");
              System.out.println("Sprite");
              break;
              case 2: 
              System.out.println("Sodas");
              System.out.println("Coca-Cola Light");
              System.out.println("Fanta");
              break;
              case 3: 
              System.out.println("Enregisantes");
              System.out.println("monster energy");
              System.out.println("powerade");
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
            }
                
       
    private void crearArchivoDeTexto (){
        File Nproducto = new File ("archivo.txt");
     try{
            
         if (Nproducto.createNewfile()){
        
             //Este grupo de comandos es para que el usuario ingrese una nueva descripccion 
             System.out.println("ingrese la nueva descripccion");
         String categoria = sc.nextLine();
         System.out.println("Archivo creado con exito");
         
         //Este grupo de comandos es para que el usuario ingrese una nueva caracteristica 
         System.out.println("ingrese la nueva caracteristica");
         String categoria = sc.nextLine();
         System.out.println("Archivo creado con exito");
         
        //Este gurpo de comandos es para que el usuario ingrese el precio del producto   
         System.out.println("ingrese el nuevo precio");
         String categoria = sc.nextLine();
         System.out.println("Archivo creado con exito");
       
         //Este gurpo de comandos es para que el usuario ingrese la cantidad de stock
          System.out.println("ingrese el nuevo Stock");
         String categoria = sc.nextLine();
         System.out.println("Archivo creado con exito");
         
     }else{
         System.out.println("Error al crear el archivo");
         }
         //Este conjunto ayuda a manejar frajmentos de Codigos
     }catch(IOException exeption){
         exeption.printStackTrace(System.out);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
