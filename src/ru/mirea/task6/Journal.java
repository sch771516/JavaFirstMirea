package ru.mirea.task6;

public class Journal implements Nameable
{
    private String name;
    private int year = 2020;
    private int price;

    Journal(String name)
    {
        this.name = name;
    }

    Journal(String name, int price)
    {
        this.price = price;
        this.name = name;
    }
    public void setPrice(int price) {this.price = price;}
    public int getPrice() {return price;}
    public String showInfo(){return "name: " + name + ", price: " + getPrice();}
    public String getName(){return name;}
}
