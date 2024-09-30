package Alta;





import *;
import java.util.Scanner;

public class alta {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Lista de productos en extistencia");
  
  //Esta funcion nos sirve para seleccionar el producto
  int producto = 1;
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
            
              
         // Este gurpo de comandos es para que el usuario ingrese un descripccion     
           System.out.println("selecciona el producto" + producto);
            
           System.out.println("Ingresa la Descripcción");
           String descripccion = scanner nextLine();  
        System.out.println("Descripción: " + descripccion);   
              
       //Este grupo de comandos es para que el usuario ingrese una nueva caracteristica 
           System.out.println("Ingresa la caracteristica");
           String caracteristica = scanner nextLine();
      
           System.out.println("caracteristica: " + caracteristica);
     //Este gurpo de comandos es para que el usuario ingrese el precio del producto         
        System.out.println("Ingresa el precio");
           String precio = scanner nextLine();
        System.out.println("precio: " + precio);
        
        System.out.println("Ingresa la cantidad de Stock");
           String stock = scanner nextLine();
        System.out.println("stock: " + stock);
              
        }
    }

   
    