package AbsrtractClassChallenge1Tim;

public  abstract class ProductForSale {
    String type;
    double price;
    String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    //Concrete method or non-Abstract Method...
    public double getSalesPrice (int quantity){
        return price * quantity;
    }
    public void printPricedItem(int quantity){
        System.out.printf("%2d qty at $%8.2f each,  %-15s %-35s %n",
                quantity, price, type, description);
    }

    //Abstract Method...
    abstract void showDetails();
}
