public class ProductoDescuento extends EstrategiaCalculable {

    public ProductoDescuento(String SKU) {
        super(SKU);
    }

    @Override
    public String getSKU() {
        return super.SKU;
    }

    @Override
    public double calcularPrecio(ProductoSeleccionado producto) {
        switch (producto.getUnidades()) {
            case 1:
            case 2:
                return producto.getUnidades() * producto.getProducto().getPrecioUnitario();
            case 3:
            case 4:
                return (producto.getUnidades() * producto.getProducto().getPrecioUnitario()) * .8;
            default:
                return (producto.getUnidades() * producto.getProducto().getPrecioUnitario()) * .5;
        }
    }

}
