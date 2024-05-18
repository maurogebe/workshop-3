import java.util.ArrayList;

public class Carrito {

    private ArrayList<ProductoSeleccionado> productos;
    private double totalPrecio;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void imprimirPrecioProductos() {
        for (ProductoSeleccionado producto : this.productos) {
            System.out.println(producto.getProducto().getNombre() + " el precio " + producto.getUnidades() + " = " + producto.getTotalPrecio());
        }
    }

    public void agregarProducto(ProductoSeleccionado producto) {
        this.productos.add(producto);
        this.calcularPrecio();
    }

    public void modificarUnidades(String SKU, int cantidad) {
        ProductoSeleccionado existProducto = null;
        for (ProductoSeleccionado producto : this.productos) {
            if (Helper.compararSKU(producto.getProducto(), SKU)) existProducto = producto;
        }
        if(existProducto != null) {
            if (existProducto.getUnidades() == Math.abs(cantidad) && cantidad < 0) {
                this.eliminarProducto(SKU);
            } else if (existProducto.getUnidades() < Math.abs(cantidad) && cantidad < 0) {
                System.out.println("No puedes quitar mas unidades de las seleccionadas");
            } else if (existProducto.getUnidades() < Math.abs(cantidad) && cantidad < 0) {
                System.out.println("No puedes quitar mas unidades de las seleccionadas");
            } else if ((existProducto.getUnidades() + cantidad) > existProducto.getProducto().getUnidades()) {
                System.out.println("Esta cantidad supera el numero de unidades en el inventario");
            } else {
                existProducto.modificarUnidades(cantidad);
                this.calcularPrecio();
            }
        } else {
            System.out.println("No existe el producto seleccionado");
        }
    }

    public void eliminarProducto(String SKU) {
        int indiceProductoAEliminar = -1;
        for (int i = 0; i < this.productos.toArray().length; i++) {
            if(Helper.compararSKU(this.productos.get(i).getProducto(), SKU)) indiceProductoAEliminar = i;
        }
        if(indiceProductoAEliminar >= 0) {
            this.productos.remove(indiceProductoAEliminar);
            this.calcularPrecio();
        } else {
            System.out.println("El SKU que proporcionaste no existe");
        }
    }

    private void calcularPrecio() {
        double total = 0;
        if(this.productos.isEmpty()) {
            System.out.println("No hay productos seleccionados");
        } else {
            for (ProductoSeleccionado producto : this.productos) {
                total += producto.getTotalPrecio();
            }
        }
        this.totalPrecio = total;
    }

    public void pagar() {
        for (ProductoSeleccionado producto : this.productos) {
            producto.getProducto().modificarUnidades(-producto.getUnidades());
        }
        this.productos.clear();
        this.totalPrecio = 0;
        System.out.println("Pagaste exitosamente, te esperamos de nuevo en nuestra tienda variada");
    }
}
