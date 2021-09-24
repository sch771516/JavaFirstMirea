package ru.mirea.task7;

public abstract class Shape
{
    protected String color;
    protected boolean filled;//Доступ в подклассах и в пакете

    public Shape(){}
    public Shape(String color, boolean filled)
    {
        this.color =  color; this.filled = filled;
    }
    //сеттеры и геттеры на поля класса
    public String getColor(){return color;}
    public void setColor(String color) {this.color = color;}

    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled) {this.filled = filled;}
    //Абстрактные методы
    public abstract double getArea();
    public abstract double getPerimeter();
    //Вывод информации
    public String toString()
    {
        return "color: " + color + ", is filled: " + filled;
    }
}
