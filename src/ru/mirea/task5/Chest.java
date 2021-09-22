package ru.mirea.task5;

public class Chest extends Furniture
{
    private int countOfAcces;

    public Chest(String title, String color, int countOfAcces)
    {
        super(title,color);
        this.countOfAcces = countOfAcces;
    }

    public void showInfo()
    {
        super.showInfo();
        System.out.println("\", Count of accessories- "+countOfAcces+".");
    }
}