package AbsrtractClassChallenge1Tim;

public class Store {
    public static void main(String[] args) {

      //Super class use korhe output dekchi..
      ProductForSale productForSale;
      productForSale=new ArtObject("Painting", 700, "A beautiful landscape painting.");
      productForSale.showDetails();
      System.out.println(productForSale.getSalesPrice(5));

        //sorasorio korhaa jai...
        ArtObject art = new ArtObject("Good", 500, "A Ugly  painting.");
        art.showDetails();
        art.printPricedItem(2);

    }
}
