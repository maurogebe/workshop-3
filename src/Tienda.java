import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private Carrito carrito;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void comprar() {
        this.carrito = new Carrito();
    }

    public void agregarProductoCarrito(String SKU, int cantidad) {
        boolean encontroProducto = false;
        for (Producto producto : this.productos) {
            if(producto.getSKU().equals(SKU)) {
                if(cantidad > 0 && cantidad <= producto.getUnidades()) {
                    this.carrito.agregarProducto(new ProductoSeleccionado(producto, cantidad));
                } else if(cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor a 0");
                } else {
                    System.out.println("Excede el numero de unidades actuales");
                }
                encontroProducto = true;
            }
        }
        if(!encontroProducto) System.out.println("Este producto no existe en nuestra tienda");
    }

    public Carrito getCarrito() {
        return carrito;
    }
}
