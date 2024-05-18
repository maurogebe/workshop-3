public class Helper {

    public static boolean compararSKU(Producto producto, String SKU) {
        return producto.getSKU().equals(SKU);
    }
}
