import java.util.ArrayList;

public class ContextoCalcularPrecio {

    private ArrayList<EstrategiaCalcularPrecio> estrategias;

    public ContextoCalcularPrecio() {
        estrategias.add(new CalcularPrecioProductoNormal());
        estrategias.add(new CalcularPrecioProductoPeso());
        estrategias.add(new CalcularPrecioProductoDescuento());
    }

    public void agregarEstrategia(EstrategiaCalcularPrecio estrategia) {
        estrategias.add(estrategia);
    }

    public static double calcularPrecio(Producto, ) {

    }

}
