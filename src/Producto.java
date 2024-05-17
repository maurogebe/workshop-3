public class Producto {

    private String SKU;
    private String nombre;
    private String descripcion;
    private int unidades;
    private double precioUnitario;

    public Producto(String SKU, String nombre, String descripcion, double precioUnitario, int unidades) {
        this.SKU = SKU;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }

    public void agregarUnidades(int unidades) {
        if(unidades > 0) {
            this.unidades += unidades;
        } else {
            System.out.println("Debe ser un numero mayor a 0");
        }
    }

    public String getSKU() {
        return SKU;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
