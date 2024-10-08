import java.util.Scanner;

public class Recepccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        // Capturar los datos del usuario
        System.out.println("Seleccione el número del producto del 1 al 6:");
        int producto = sc.nextInt();  

        System.out.println("Ingresa el precio:");
        int precio = sc.nextInt();  

        System.out.println("Ingresa la cantidad:");
        int cantidad = sc.nextInt(); 
        // Generar fechas de creación y entrega
        int fechaDeCreacion = (int) (Math.random() * 9000) + 1000;
        int fechaEntrega = (int) (Math.random() * 9000) + 1000;

        // Calcular el total
        int total = cantidad * precio;

        // Mostrar información del producto seleccionado
        switch (producto) {
            case 1:
                System.out.println("Producto seleccionado: Coca-Cola Original");
        } // Mostrar detalles del pedido
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
             break;
            case 2:
                System.out.println("Producto seleccionado: Coca-Cola Zero");
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
                break;
            case 3:
                System.out.println("Producto seleccionado: Sprite");
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
        }
                break;
            case 4:
                System.out.println("Producto seleccionado: Coca-Cola Light");
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
                break;
            
            case 5:
                System.out.println("Producto seleccionado: Monster Energy");
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
                break;
            case 6:
                System.out.println("Producto seleccionado: Powerade");
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
                break;
            default:
                System.out.println("No corresponde a ningún producto");
                return;  // Termina el programa si no hay producto válido
        }

    }

