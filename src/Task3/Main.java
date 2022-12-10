package Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Price[] products = new Price[2];
        String productName;
        String shopName;
        int price;
        int count = 0;
        Scanner scText = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product name: ");
            productName = scText.nextLine();
            System.out.println("Enter shop name: ");
            shopName = scText.nextLine();
            System.out.println("Enter price: ");
            price = scInt.nextInt();
            products[i] = new Price(productName, shopName, price);
        }
        System.out.println();
        System.out.println();
        Arrays.sort(products, Comparator.comparing(Price::getShopName));
        System.out.println("Enter shop name: ");
        shopName = scText.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i].getShopName().equals(shopName) ){
                count++;
                System.out.println(products[i]);
            }
        }
        if (count==0){
            throw new Exception ("No such shop!");
        }

    }
}
