package ru.mirea.task5;

public abstract class Furniture
{
    private String title;
    private String color;

    public String getTitle() {return title;}
    public String getColor() {return color;}

    public Furniture(String title, String color)
    {
        this.title = title;
        this.color = color;
    }

    public void showInfo()
    {
        System.out.print("Title- \"" + getTitle() + "\", Color- \"" + getColor());
    }

}
