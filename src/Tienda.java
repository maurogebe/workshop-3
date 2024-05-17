import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private ArrayList<EstrategiaCalcularPrecio> estrategias;

    public Tienda() {}

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void agregarEstrategia(EstrategiaCalcularPrecio estrategia) {
        this.estrategias.add(estrategia);
    }
}
