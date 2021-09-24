package ru.mirea.task7;

public class Circle  extends  Shape
{//поля класса
    protected double radius;
    //конструкторы
    public Circle(){}
    public Circle(double radius){this.radius = radius;}
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    //сеттеры, геттер на уникальные поля данного класса
    public double getRadius(){return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    //реализация абстрактных классов
    public double getArea(){ return 3.14 * radius * radius;}
    public double getPerimeter(){ return 2 * 3.14 * radius;}

    //реализация метода для вывода информации путем добавления уникальной информации класса
    public String toString()
    {
        return  "color: " + color + ", is filled: " + filled+"radius: " + radius;
    }
}
