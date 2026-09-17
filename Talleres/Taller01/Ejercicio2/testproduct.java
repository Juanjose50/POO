public class testproduct {
    public static void main(String[] args) {
        product product = new product("PC", 1200, 10);
        System.out.println("Producto creado: " + product.getName() + " | Precio: $" + product.getPrice() + " | Disponible: " + product.getStock());

        System.out.println("Cambiar precio a 1100.0: " + (product.setPrice(1100.0) ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Cambiar disponible a 15: " + (product.setStock(15) ? "ACEPTADO" : "RECHAZADO"));

        System.out.println("Cambiar nombre a vacio: " + (product.setName("   ") ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Cambiar precio a -50: " + (product.setPrice(-50) ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Cambiar disponible a -5: " + (product.setStock(-5) ? "ACEPTADO" : "RECHAZADO"));

        System.out.println("Estado final - " + product.getName() + " | Precio: $" + product.getPrice() + " | Stock: " + product.getStock());
    }
}