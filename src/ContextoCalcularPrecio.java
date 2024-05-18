import java.util.ArrayList;
import java.util.Arrays;

public class ContextoCalcularPrecio {

    private ArrayList<EstrategiaCalculable> estrategias;

    public ContextoCalcularPrecio() {
        this.estrategias = new ArrayList<>();
    }

    public void agregarEstrategia(EstrategiaCalculable estrategia) {
        estrategias.add(estrategia);
    }

    public static double calcularPrecio(ProductoSeleccionado producto) {
        ContextoCalcularPrecio contexto = new ContextoCalcularPrecio();
        contexto.agregarEstrategia(new CalcularPrecioProductoNormal("EA"));
        contexto.agregarEstrategia(new CalcularPrecioProductoPeso("WE"));
        contexto.agregarEstrategia(new CalcularPrecioProductoDescuento("SP"));
        for(EstrategiaCalculable estrategia : contexto.estrategias) {
            if(producto.getProducto().getSKU().substring(0, 2).equals(estrategia.getSKU())) {
                return estrategia.calcularPrecio(producto);
            }
        }
        System.out.println("No existe estrategia para este producto");
        return 0;
    }

}
