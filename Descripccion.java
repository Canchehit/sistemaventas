
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Descripccion {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Escoja un producto ");
  
  //Esta funcion nos sirve para seleccionar el producto
  int producto = 1;
          switch(producto){
             
              case 1:
              System.out.println("Coca-Cola Original");
              break;
              case 2: 
              System.out.println("Coca-Cola Zero");
              break;
              case 3: 
              System.out.println("Coca-Cola Light");
              break;
              case 4: 
              System.out.println("Sprite");
              break;
              case 5: 
              System.out.println("Fanta");
              break;
              case 6: 
              System.out.println("powerade");
              break;
              case 7: 
              System.out.println("monster energy");
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
          }
          System.out.println("El producto escogido es:"+ producto);
    
}
   
     
      private void crearArchivoDeTexto (){
        File archivo = new File ("archivo.txt");
     try{
         if (archivo.createNewfile()){
         System.out.println("ingrese la nueva descripccion");
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
    System.out.println("Desea eliminar la descripccion");
    if (eliminada) {
            return ResponseEntity.ok("descripccion eliminada con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("descripccion no encontrada o no se puede eliminar");
        }
     
     
     
     
}