public class CalcularPrecioProductoPeso extends EstrategiaCalculable {

    public CalcularPrecioProductoPeso(String SKU) {
        super(SKU);
    }

    @Override
    public String getSKU() {
        return super.SKU;
    }

    @Override
    public double calcularPrecio(ProductoSeleccionado producto) {
        double pesoKG = producto.getUnidades() / 1000;
        return pesoKG * producto.getProducto().getPrecioUnitario();
    }

}
