package AWT.Market;

import java.util.ArrayList;

public class List_Market {
    
    private int code,qty,discount;
    private String name;
    private float price;
    private double total,payment;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getDiscount() {
        return discount;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public double getTotal() {
        return total;
    }
    public double getPayment() {
        return payment;
    }

    public List_Market(int code, int qty, int discount, String name, float price, double total, double payment) {
        this.code = code;
        this.qty = qty;
        this.discount = discount;
        this.name = name;
        this.price = price;
        this.total = total;
        this.payment = payment;
    }

    static ArrayList<List_Market> list = new ArrayList<>();
    
}
