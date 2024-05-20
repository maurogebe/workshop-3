import java.util.ArrayList;

public class CalcularPrecio {

    private ArrayList<EstrategiaCalculable> estrategias;

    public CalcularPrecio() {
        this.estrategias = new ArrayList<>();
        this.estrategias.add(new ProductoNormal("EA"));
        this.estrategias.add(new ProductoPeso("WE"));
        this.estrategias.add(new ProductoDescuento("SP"));
    }

    public void agregarEstrategia(EstrategiaCalculable estrategia) {
        estrategias.add(estrategia);
    }

    public double calcularPrecio(ProductoSeleccionado producto) {
        for(EstrategiaCalculable estrategia : this.estrategias) {
            if(producto.getProducto().getSKU().substring(0, 2).equals(estrategia.getSKU())) {
                return estrategia.calcularPrecio(producto);
            }
        }
        System.out.println("No existe estrategia para este producto");
        return 0;
    }

}
