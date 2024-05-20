public class ProductoPeso extends EstrategiaCalculable {

    public ProductoPeso(String SKU) {
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
