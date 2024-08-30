package com.spring.core.lifecycle;

public class Samosa {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        System.out.println("Setting Property");
        this.price = price;
    }

    public Samosa(Double price) {
        this.price = price;
    }


    public Samosa() {

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside Init");
    }

    public void destroy(){
        System.out.println("Inside Destroy");
    }
     
}
