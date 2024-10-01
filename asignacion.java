package Asignacion;


import java.util.Scanner;

public class asignacion {
   public static void main(String[]args){ 
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el número 1 si desa crear un Nuevo producto:");
       System.out.println("Ingrese el número 2 si desa cambiar algun producto:");
       int num = 0;
      if (num == 1){
             System.out.println("selecciona la categoria de tu nuevo producto:");
    
             
       int nuevo = 0;
    switch (nuevo){
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
             System.out.println("Esta es la categoria que escojistes:"+nuevo);

             
             String caracteristica;
             String Descripccion;
     //Este conjutno es para que el usuario cree la descripccion      
             System.out.println("ingresa su Caracteristica");
           String caracteristica = sc.nextLine();
      //Este conjutno es para que el usuario cree la descripccion
             System.out.println("ingresa su Descripcción ");
           String Descripccion = sc.nextLine();
      
    System.out.println("Producto creaado con exito  ");  
      
    
      }else{ 
          if (num == 2){
          int producto = 0;
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
          
           String Ncaracteristica;
           String NDescripccion;
     //Este conjutno es para que el usuario cree la nueva caracterisrica     
          System.out.println("ingresa la nueva Caracteristica");
           String Ncaracteristica = sc.nextLine();
     //Este conjutno es para que el usuario cree la nueva descripccion     
          System.out.println("ingresa la nueva Descripccion");
           String NDescripccion = sc.nextLine();
          }
      }
   }
    
    
}
