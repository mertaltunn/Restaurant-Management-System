public class Meal {
    private String name;

    private double price;

    private int prepareTime;

    private int stock;

    private boolean hasStock;

    public Meal(String name, double price, int prepareTime, int stock) {
        this.name = name;
        this.price = price;
        this.prepareTime = prepareTime;
        this.stock = stock;
        this.hasStock = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(int prepareTime) {
        this.prepareTime = prepareTime;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isHasStock() {
        return hasStock;
    }

    public void setHasStock(boolean hasStock) {
        this.hasStock = hasStock;
    }
}
