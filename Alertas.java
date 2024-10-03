
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Alertas {
   
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("ingresa el codigo del producto");
    
         int CocaColaOriginal = 123;
        int CocaColaZero = 456;
        int Sprite = 789;
        int CocaColaLight = 1011;
        int monsterEnergy = 1213;
        int powerade = 1415;
   
      
    }
     public class ArchivoTexto {
    public static void main(String[] args) {
        crearArchivoDeTexto();
    }

    private static void crearArchivoDeTexto() {
        Scanner sc = new Scanner(System.in);
        File archivo = new File("archivo.txt");

        // Esta funcion if nos sirve para seleccionar el producto por su codigo unico
     try {   
          int punto = 0;
         int cantidad = 0;
         int codigo = 0;
        if (codigo == 123){
            System.out.println("CocaColaOriginal");     
            if (cantidad <= punto){
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                if (cantidad == punto)
            
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }     
        }else{
            if (codigo == 456){
                System.out.println("CocaColaZero");
                System.out.println("cantida de stock:");
                System.out.println("500");          
                if (cantidad <= punto){
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                    if (cantidad == punto)
                
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }     
            }else{
                if (codigo == 789){
                    System.out.println("Sprite");
                    System.out.println("cantida de stock:");
                    System.out.println("1000");
                    if (cantidad <= punto){
                       
                    
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                        if (cantidad == punto)
                    
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }  
                }else{
                    if (codigo == 1011){
                        System.out.println("CocaColaLight");
                        System.out.println("cantida de stock:");
                        System.out.println("600");
            // este if nos sierve para crear un una alerta              
                        if (cantidad <= punto){
                        
                        
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                            if (cantidad == punto)
                        
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }                          
                    }else{
                        if (codigo == 1213){
                            System.out.println("monsterEnergy");
                            System.out.println("cantida de stock:");
                            System.out.println("1000");
                           if (cantidad <= punto){
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                               if (cantidad == punto)
                           
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }
                        }else{
                            if (codigo == 1415){
                                System.out.println("powerade");
                                System.out.println("cantida de stock:");
                                System.out.println("1000");
                                if (cantidad <= punto){
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bajo");                    
                       }else{ 
                                    if (cantidad == punto)
                                
                         System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println(" Ingresa el numero del puento de orden:"+punto);
                  System.out.println(" Cantidad de stock bueno");
                          }
                                
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    
  
        
        
    
    
    
}
