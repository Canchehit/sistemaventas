
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registro_Ventas {
        public static void main(String[]args){
    System.out.println("Ingrese codigo");
    
    int CocaColaOriginal = 123;
        int CocaColaZero = 456;
        int Sprite = 789;
        int CocaColaLight = 1011;
        int monsterEnergy = 1213;
        int powerade = 1415;
   
      


       // Esta funcion if nos sirve para seleccionar el producto por su codigo unico
     try {   
          int fecha = 0;
         int cantidad = 0;
         int codigo = 0;
        if (codigo == 123){
            System.out.println("CocaColaOriginal");
            System.out.println("cantida de stock disponibles:");
            System.out.println("2000");
            if (cantidad <= 2000){
                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                  System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                       }else{ 
                          System.out.println("No exite ese producto");
                          }     
        }else{
            if (codigo == 456){
                System.out.println("CocaColaZero");
                System.out.println("cantida de stock:");
                System.out.println("500");          
                if (cantidad <= 500){
                      System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                      System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                           }else{ 
                              System.out.println("No exite ese producto");    
                              }     
            }else{
                if (codigo == 789){
                    System.out.println("Sprite");
                    System.out.println("cantida de stock:");
                    System.out.println("1000");
                    if (cantidad <= 1000){
                          System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                          System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                               }else{ 
                                  System.out.println("No exite ese producto");    
                                  }  
                }else{
                    if (codigo == 1011){
                        System.out.println("CocaColaLight");
                        System.out.println("cantida de stock:");
                        System.out.println("600");
            // este if nos sierve para crear un registro de ventas             
                        if (cantidad <= 600){
                              System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                              System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                                   }else{ 
                                      System.out.println("No exite ese producto");    
                                      }                          
                    }else{
                        if (codigo == 1213){
                            System.out.println("monsterEnergy");
                            System.out.println("cantida de stock:");
                            System.out.println("1000");
                            if (cantidad <= 1000){
                                  System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                                  System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                                       }else{ 
                                          System.out.println("No exite ese producto");    
                                          }
                        }else{
                            if (codigo == 1415){
                                System.out.println("powerade");
                                System.out.println("cantida de stock:");
                                System.out.println("1000");
                                if (cantidad <= 1000){
                                      System.out.println(" Ingresa la cantida de porductos a vender :"+cantidad);
                                       System.out.println("Ingresa la fecha:"+fecha);
                                       System.out.println("producto vendido con exito");
                                           }else{ 
                                              System.out.println("Error no existe esa cantidad");    
                                              }
                                
                            }
                        }
                    }
                }
            }
        }

    
    } 
         System.out.println("Venta Realizarda");    
}
    
}
