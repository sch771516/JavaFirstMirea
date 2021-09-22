package ru.mirea.task6;

public class Book implements Nameable
{
    private String name;
    private String author;
    private int year;
    private int price;

    Book(String name, String author, int year)
    {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    Book(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) { this.price = price; }
    public int getPrice() {return price;}
    public String showInfo() {return "name: " + name + ", author: "+ author + ", year: " + year + ", price: " + getPrice();}
    public String getName() {return name;}
}
