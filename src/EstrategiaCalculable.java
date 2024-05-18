public abstract class EstrategiaCalculable {

    protected String SKU;

    public EstrategiaCalculable(String SKU) {
        this.SKU = SKU;
    }

    abstract String getSKU();

    public abstract double calcularPrecio(ProductoSeleccionado producto);
}
