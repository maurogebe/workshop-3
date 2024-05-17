public class ProductoSeleccionado {

    private Producto producto;
    private int unidades;
    private double totalPrecio;

    public ProductoSeleccionado(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
        this.totalPrecio = 0;
    }
}
