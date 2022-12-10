package Task3;

public class Price {
    private String productName;
    private String shopName;
    private int price;
    public Price(String productName, String shopName, int price){
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getShopName() {
        return shopName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{"+"Product name:" + getProductName()+", ShopName: "+getShopName()+", Price: "+getPrice() +"}";
    }
}
