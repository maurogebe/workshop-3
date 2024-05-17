public class ProductoSeleccionado {

    private Producto producto;
    private int unidades;
    private double totalPrecio;

    public ProductoSeleccionado(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
        this.totalPrecio = 0;
    }

    public void modificarUnidades(int cantidad) {
        if(cantidad > 0) {
            this.unidades += cantidad;
        } else if(cantidad < 0 && Math.abs(cantidad) < this.unidades) {
            this.unidades += cantidad;
        } else {
            System.out.println("Ingrese un numero menor a 0 o mayor a 0");
        }
    }

    public void calcularPrecio() {
        this.totalPrecio = ContextoCalcularPrecio.
    }
}
