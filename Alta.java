
package Alta;

public class Alta {
int(input("Ingrese el número de la categoría: "));
    //Este bloque evalua si la categoria es validad para ingresar
    while categoria_seleccionada not in range(1, len(categorias) + 1);
        categoria_seleccionada = int(input("Selección inválida. Ingrese el número de la categoría: "));

    descripcion = input("Ingrese una descripción del producto (opcional): ");

    caracteristicas = input("Ingrese las características del producto): ");
//Este bloque es para que puedad ingresar el precio de uno de lso productos
    precio = float(input("Ingrese el precio del producto: "));
    while precio <= 0;
        precio = float(input("El precio debe ser positivo. Ingrese nuevamente: "));
// Este bloque es para verificar la candidad de stock que hay 
    stock_inicial = int(input("Ingrese la cantidad inicial de stock: "));
    while stock_inicial < 0;
        stock_inicial = int(input("La cantidad de stock debe ser un número positivo. Ingrese nuevamente: "));
// este bloque nos sirve para creat un inetificador unico para el producto
    # Generar identificador único;
    import uuid;
    id_producto = str(uuid.uuid4());
// Este bloque es para guardar lo que se cambio 
    # Guardar en archivo de texto;
    with open('productos.txt', 'a') as archivo;
        archivo.write(f"{id_producto},{nombre},{categorias[categoria_seleccionada-1]},{descripcion},{caracteristicas},{precio},{stock_inicial}\n");

    print("Producto creado correctamente.");

}
