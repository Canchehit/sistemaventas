
import java.util.Scanner;

public class Historial {
  
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           System.out.println("Ingrese su rol en la empresa");
           String usuario = null;   
   
          System.out.println("ingresa un numero del 1 al 6 para seleccionar el producto");
     System.out.println("1 CocaColaOriginal");
      System.out.println("2 CocaColaZero ");
      System.out.println("3 CocaColaLight ");
       System.out.println("4 Sprite ");
        System.out.println("5 Powerade ");
         System.out.println("6 monsterEnergy ");
         
    //Esta funcion nos sirve para seleccionar el producto
  int producto = 0;
 
              
          switch(producto){
             
              case 1:
              System.out.println("Coca-Cola Original");
              System.out.println("cantida de stock disponibles:");
            System.out.println("2000");
             System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              case 2: 
              System.out.println("Coca-Cola Zero");
               System.out.println("cantida de stock:");
                System.out.println("500"); 
                 System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              case 3: 
              System.out.println("Coca-Cola Light");
              System.out.println("cantida de stock:");
                        System.out.println("600");
                         System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              case 4: 
              System.out.println("Sprite");
              System.out.println("cantida de stock:");
                    System.out.println("1000");
                     System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              case 5: 
              System.out.println("powerade");
              System.out.println("cantida de stock:");
                             System.out.println("1000");
                              System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              case 6: 
              System.out.println("monster energy");
               System.out.println("cantida de stock:");
                            System.out.println("1000");
                             System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "La persona que lo realizo  es:"+usuario);
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
          }
    

          
          
          
          
          
          
          
        }

   
    }
    
  
    

