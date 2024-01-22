class Product {
    String name;
    double price;
    double rating;
    String category;

    public Product(String name, double price, double rating, String category) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f - Rating: %.1f - Category: %s", name, price, rating, category);
    }
}