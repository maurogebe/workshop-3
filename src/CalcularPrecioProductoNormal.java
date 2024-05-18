public class CalcularPrecioProductoNormal extends EstrategiaCalculable {

    public CalcularPrecioProductoNormal(String SKU) {
        super(SKU);
    }

    @Override
    public String getSKU() {
        return super.SKU;
    }

    @Override
    public double calcularPrecio(ProductoSeleccionado producto) {
        return producto.getUnidades() * producto.getProducto().getPrecioUnitario();
    }
}
