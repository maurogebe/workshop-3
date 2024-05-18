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

    public void modificarUnidades(int unidades) {
        if(unidades > 0) {
            this.unidades += unidades;
        } else if(unidades < 0 && Math.abs(unidades) < this.unidades) {
            this.unidades += unidades;
        } else {
            System.out.println("Ingrese un numero menor a 0 o mayor a 0");
        }
    }

    public String getSKU() {
        return SKU;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }
}
