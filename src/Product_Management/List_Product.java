
package Product_Management;

import java.util.ArrayList;

public class List_Product {

    public int getCode() {
        return code;
    }


    public int getQty() {
        return qty;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }
    private int code;
    private int qty;
    private String name;
    private double price;
    private double amount;

    public List_Product(int code,  String name, double price,int qty, double amount) {
        this.code = code;
        this.qty = qty;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    static ArrayList <List_Product> list = new ArrayList<>();
    
}
