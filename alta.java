package Alta;






import java.util.Scanner;

public class alta {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Lista de productos en extistencia");
  
  //Esta funcion nos sirve para seleccionar el producto
  int producto = 0;
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
            }
              
         // Este gurpo de comandos es para que el usuario ingrese un descripccion     
           System.out.println("selecciona el producto" + producto);
            
           System.out.println("Ingresa la Descripcción");
           String descripccion = sc nextLine();  
        System.out.println("Descripción: " + descripccion);   
              
       //Este grupo de comandos es para que el usuario ingrese una nueva caracteristica 
           System.out.println("Ingresa la caracteristica");
           String caracteristica = sc nextLine();
           System.out.println("caracteristica: " + caracteristica);
     
       //Este gurpo de comandos es para que el usuario ingrese el precio del producto         
        System.out.println("Ingresa el precio");
           String precio = sc nextLine();
        System.out.println("precio: " + precio);
        
        //Este gurpo de comandos es para que el usuario ingrese la cantidad de stock
        System.out.println("Ingresa la cantidad de Stock");
           String stock = sc nextLine();
        System.out.println("stock: " + stock);
   
              
        }

    // Esta conjuento de codgio es para crear un codiog unico por porducto
         public String generarcodigo(int c){
        String codigo ="";
        int cantidad = getProducto().length();
        if (cantidad > 0){
        codigo +="PRODUCTO-000"+c;
        }else{
        codigo +="PRODUCTO-000"+c;      
                }
        return codigo;
          } 
         System.out.println("Los cambios se han guardado con exito");
         
    }
 public baja {
public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Lista de productos en extistencia");
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

              System.out.println("Desar borrar el producto escriba 1 si si o 2 si no:");
    int num = 0 ;         
if (num == 1){
boolean porducto;
    
    if (producto) {
            return ResponseEntity.ok("Porducto eliminado con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Porducto no encontraado o no se puede eliminar");
        }
    

}else{
System.out.println("No se borro ningun porducto ");
}












}










   
    