package Assessement;

public interface MontrealTradedProducts<Product> {


    default <Product> void addNewProduct(Product product) {

    }

    void trade(Product product, int quantity);

    int totalTradeQuantityForDay();

    double totalValueOfDaysTradedProducts();
}
