package ru.mirea.task7;

public class Rectangle  extends  Shape
{
    //поля класса
    protected double length;
    protected  double width;
    //конструкторы
    public Rectangle(){}
    public Rectangle(double width, double length){this.length = length; this.width = width;}
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    //сеттеры, геттер на уникальные поля данного класса
    public double getLength(){return length;}
    public void setLength(double length) {this.length = length;}

    public double getWidth(){return width;}
    public void setWidth(double length) {this.width = length;}
    //реализация абстрактных классов
    public double getArea(){ return length * width;}
    public double getPerimeter(){ return 2 * (length + width);}

    //реализация метода для вывода информации путем добавления уникальной информации класса
    public String toString()
    {
        return "color: " + color + ", is filled: " + filled +", length: " + length + ", width: " + width;
    }
}
