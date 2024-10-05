import java.util.Scanner;
        
public class GeneracionDeInformes {
   Scanner sc = new Scanner(System.in);
          System.out.println("ingresa un Numero del 1 al 6");
    
    //Esta funcion nos sirve para seleccionar el producto
  int producto = 0;
  int valor  = 0;
              
          switch(producto){
             
              case 1:
                   System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Original");
              System.out.println("cantida de stock disponibles:");
            System.out.println("2000");
             System.out.println("El producto escogido es:"+ producto);
                   System.out.println( "Valor de Stock:"valor);
              break;
              case 2: 
                   System.out.println("Sodas carbonatadas");
              System.out.println("Coca-Cola Zero");
               System.out.println("cantida de stock:");
                System.out.println("500"); 
                 System.out.println("El producto escogido es:"+ producto);
                System.out.println( "Valor de Stock:"valor);
              break;
              case 3: 
                     System.out.println("Sodas");
              System.out.println("Coca-Cola Light");
              System.out.println("cantida de stock:");
                        System.out.println("600");
                         System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "Valor de Stock:"valor);
              break;
              case 4: 
                   System.out.println("Sodas carbonatadas");
              System.out.println("Sprite");
              System.out.println("cantida de stock:");
                    System.out.println("1000");
                     System.out.println("El producto escogido es:"+ producto);
                     System.out.println( "Valor de Stock:"valor);
              break;
              case 5: 
                  System.out.println("Enregisantes");
              System.out.println("powerade");
              System.out.println("cantida de stock:");
                             System.out.println("1000");
                              System.out.println("El producto escogido es:"+ producto);
                    System.out.println( "Valor de Stock:"+valor);
              break;
              case 6: 
                  System.out.println("Enregisantes");
              System.out.println("monster energy");
               System.out.println("cantida de stock:");
                            System.out.println("1000");
                             System.out.println("El producto escogido es:"+ producto);
                     System.out.println( "Valor de Stock:"valor);
              break;
              default: 
              System.out.println("No corresponde a ningun producto");
              break;
          }
    // Lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto 7", 50, 500.00));
        productos.add(new Producto("Producto 8", 20, 200.00));
        productos.add(new Producto("Producto 9", 100, 1000.00));

        // Crear gestor
        GestorProductos gestor = new GestorProductos(productos);

        // Ordenar por nombre
        System.out.println("Ordenando por nombre...");
        gestor.ordenarPorNombre();
        gestor.exportarAArchivoCSV("productos_ordenados_por_nombre.csv");

        // Ordenar por cantidad de stock
        System.out.println("Ordenando por cantidad de stock...");
        gestor.ordenarPorCantidadStock();
        gestor.exportarAArchivoCSV("productos_ordenados_por_stock.csv");

        // Ordenar por valor total del stock
        System.out.println("Ordenando por valor total del stock...");
        gestor.ordenarPorValorTotalStock();
        gestor.exportarAArchivoCSV("productos_ordenados_por_valor_total.csv");
    }

                  
       
    
    

                  
