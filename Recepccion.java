import java.util.Scanner;

public class PedidoProductos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        // Capturar los datos del usuario
        System.out.println("Seleccione el número del producto del 1 al 7:");
        int producto = sc.nextInt();  // Captura la opción de producto

        System.out.println("Ingresa el precio:");
        int precio = sc.nextInt();  // Captura el precio del producto

        System.out.println("Ingresa la cantidad:");
        int cantidad = sc.nextInt();  // Captura la cantidad de productos

        // Generar fechas de creación y entrega
        int fechaDeCreacion = (int) (Math.random() * 9000) + 1000;
        int fechaEntrega = (int) (Math.random() * 9000) + 1000;

        // Calcular el total
        int total = cantidad * precio;

        // Mostrar información del producto seleccionado
        switch (producto) {
            case 1:
                System.out.println("Producto seleccionado: Coca-Cola Original");
                break;
            case 2:
                System.out.println("Producto seleccionado: Coca-Cola Zero");
                break;
            case 3:
                System.out.println("Producto seleccionado: Sprite");
                break;
            case 4:
                System.out.println("Producto seleccionado: Coca-Cola Light");
                break;
            case 5:
                System.out.println("Producto seleccionado: Fanta");
                break;
            case 6:
                System.out.println("Producto seleccionado: Monster Energy");
                break;
            case 7:
                System.out.println("Producto seleccionado: Powerade");
                break;
            default:
                System.out.println("No corresponde a ningún producto");
                return;  // Termina el programa si no hay producto válido
        }

        // Mostrar detalles del pedido
        System.out.println("Fecha de Creación: " + fechaDeCreacion);
        System.out.println("Fecha de Entrega: " + fechaEntrega);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);

        // Preguntar si desea cancelar el pedido
        System.out.println("¿Desea cancelar el pedido? (s/n)");
        sc.nextLine();  // Consumir el salto de línea pendiente
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Usted ha respondido que SÍ, el pedido será cancelado.");
        } else {
            System.out.println("Usted ha respondido que NO, el pedido sigue en proceso.");
        }

        sc.close();  // Cerrar el escáner
    }
}
