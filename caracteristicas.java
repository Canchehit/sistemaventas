import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Categorias {
    
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
    }
//En esta conjunto de codigo es donde el usuario puede agregar un producto
   class Categoria {
          public Categoria() {
        }
    }
   
     public class Almacenar {

    // Lista para almacenar las categorías
    private static List<Categoria> categorias = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String descripcion;
        String continuar;

        do {
            // Solicitar el nombre de la categoría
            System.out.print("Ingrese el nombre de la categoría: ");
            nombre = scanner.nextLine();

            // Solicitar la descripción de la categoría
            System.out.print("Ingrese la descripción de la categoría: ");
            descripcion = scanner.nextLine();

            // Crear la nueva categoría y agregarla a la lista
            Categoria nuevaCategoria = new Categoria(nombre, descripcion);
            categorias.add(nuevaCategoria);

            // Preguntar si desea agregar otra categoría
            System.out.print("¿Desea agregar otra categoría? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar todas las categorías agregadas
        System.out.println("Categorías ingresadas:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }
//blodque para eliminar 
    boolean eliminada;
    System.out.println("Desea eliminar la carcateristica");
    if (eliminada) {
            return ResponseEntity.ok("carcteristica eliminada con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("caracteristica no encontrada o no se puede eliminar");
        }
    
    
    
    
    
    
}
