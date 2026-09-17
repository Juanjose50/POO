public class product {
    private String name;
    private double price;
    private int stock;

    public product(String name, double price, int stock) {
        this.name = (name != null && !name.trim().isEmpty()) ? name : "Unknown";
        this.price = (price > 0) ? price : 1.0;
        this.stock = (stock >= 0) ? stock : 0;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(double price) {
        if (price > 0) {
            this.price = price;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public boolean setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
            return true;
        }
        return false;
    }
}
