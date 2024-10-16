
import java.util.Scanner;


public class GraficaEstadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Productos en exitencia:");     
       
    System.out.println("1 CocaColaOriginal");
     System.out.println("2 CocaColaZero ");
      System.out.println("3 CocaColaLight ");
       System.out.println("4 Sprite ");
        System.out.println("5 Powerade ");
         System.out.println("6 monsterEnergy ");    
        
        
        
  String[] productos = {"1 CocaColaOriginal", "2 CocaColaZero", "3 CocaColaLight", "4 Sprite","5 Powerade","6 monsterEnergy"};
        int[] cantidadesProductos = {100, 75, 150, 50, 175, 50};

        for (int i = 0; i < productos.length; i++) {
            dataset.addValue(cantidadesProductos[i], "Inventario", productos[i]);
        }
        
        String[] categorias = {"Sodas carbonatadas", "Sodas", "Enregisantes",""};
        int[] cantidadesCategoria = {3, 1, 2};

        for (int i = 0; i < categorias.length; i++) {
            dataset.addValue(cantidadesCategoria[i], "Inventario", categorias[i]);
        }
         String[] fechas = {"Enero", "Febrero", "Marzo"};
        int[] cantidadesfecha = {200, 400, 600};

        for (int i = 0; i < fechas.length; i++) {
            dataset.addValue(cantidadesfecha[i], "Inventario", fechas[i]);
        }
    }      
        
        
        
    }

