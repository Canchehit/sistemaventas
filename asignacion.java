package Asignacion;

import Modelo.*;
import *;
import java.util.Scanner;

public class asignacion {
   public static void main(String[]args){ 
       Scanner sc = new Scanner(System.in);
       System.out.println("seleccione el tipo de categoria ");
       String categoria = 0;
       // esta funcion nos ayuda para seleccionar el tipo de producto
       
               switch (categoria){
                   case 1: categoria = "bebida carbonatada";
                   System.out.println("ingrese la espesificación y sus caracteristicas ");
                   break;
                   case 2: categoria = "bebida energetica";
                   System.out.println("ingrese la espesificación y sus caracteristicas ");
                   break;
                   default: categoria = "No existe esa categoria";
                   break;
               }
   }
    
    
}
