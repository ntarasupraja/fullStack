package com.careerit.jfs.basics.day12;


class Product{
    private int pid;
    private String name;
    private double price;
    public Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    public void showDetails(){
    System.out.println(String.format("%s,%s,%s",pid,name,price));
}
}
public class ProductManager {
    public static void main(String[] args) {
        Product product=new Product(1001,"tara",9000);
        product.showDetails();
    }
}
