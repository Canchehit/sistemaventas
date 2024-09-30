 import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Categorias {

    private static Object HttpStatus;
    Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
    System.out.println("Escoja una categoria ");
        
        
     int categoria = 1;   
    switch(categoria){
             
              case 1:
              System.out.println("Sodas carbonatadas");
              
              break;
              case 2: 
              System.out.println("Sodas");
              
              case 3: 
              System.out.println("Enregisantes");
             
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
            }
       
   // crear un archivo nuevo 
    private void crearArchivoDeTexto (){
        File archivo = new File ("archivo.txt");
     try{
         if (archivo.createNewfile()){
         System.out.println("ingrese la nueva categoria");
         String categoria = sc nextLine();
         System.out.println("Archivo creado con exito");
     }else{
         System.out.println("Error al crear el archivo");
         }
     }catch(IOException exeption){
         exeption.printStackTrace(System.out); 
     }
     //blodque para eliminar 
    boolean eliminada;
    System.out.println("Desea eliminar la categoria");
    if (eliminada) {
            return ResponseEntity.ok("Categoría eliminada con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categoría no encontrada o no se puede eliminar");
        }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
