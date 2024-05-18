public class Main {
    public static void main(String[] args) {

//        Creamos la instancia de la Tienda
        Tienda almacen = new Tienda();

//        Agregamos los productos a la Tienda
        almacen.agregarProducto(new Producto("EAT7Y332", "Tenis Adidas", "Tenis Adidas Dama", 150000, 3));
        almacen.agregarProducto(new Producto("WESJBBR", "Frijoles verdes", "Frijoles verdes de Antioquia", 10000, 10000));
        almacen.agregarProducto(new Producto("SPKUSGV7", "Aguardiente tapa verde", "Aguardiente tapa verde de Antioquia", 90000, 7));

//        Empezamos a comprar en el carrito
        almacen.comprar();
        almacen.agregarProductoCarrito("EAT7Y332", 2);
        almacen.agregarProductoCarrito("WESJBBR", 2000);
        almacen.agregarProductoCarrito("SPKUSGV7", 5);
        almacen.getCarrito().imprimirPrecioProductos();
        System.out.println("Precio total del carrito: " + almacen.getCarrito().getTotalPrecio());
        almacen.getCarrito().pagar();

    }
}