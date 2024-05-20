public class ProductoNormal extends EstrategiaCalculable {

    public ProductoNormal(String SKU) {
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
