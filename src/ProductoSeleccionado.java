public class ProductoSeleccionado {

    private Producto producto;
    private int unidades;
    private double totalPrecio;

    public ProductoSeleccionado(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
        this.calcularPrecio();
    }

    private void calcularPrecio() {
        CalcularPrecio contexto = new CalcularPrecio();
        this.totalPrecio = contexto.calcularPrecio(this);
    }

    public void modificarUnidades(int cantidad) {
        if(cantidad > 0) {
            this.unidades += cantidad;
            this.calcularPrecio();
        } else if(cantidad < 0 && Math.abs(cantidad) < this.unidades) {
            this.unidades += cantidad;
            this.calcularPrecio();
        } else {
            System.out.println("Ingrese un numero menor a 0 o mayor a 0");
        }
    }

    public int getUnidades() {
        return unidades;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }
}
