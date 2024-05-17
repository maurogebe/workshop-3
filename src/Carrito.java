import java.util.ArrayList;

public class Carrito {

    private ArrayList<ProductoSeleccionado> productos;

    public Carrito() {}

    public void agregarProducto(ProductoSeleccionado producto) {
        this.productos.add(producto);
    }
}
