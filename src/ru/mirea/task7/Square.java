package ru.mirea.task7;

public class Square extends Rectangle
{
    protected double side;
    //конструкторы
    public Square(){}
    public Square(double side){this.side = side;}
    public Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    //сеттеры, геттер на уникальные поля данного класса
    public double getSide(){return side;}
    public void setSide(double side) {this.side = side;}

    public void setLength(double side) {this.length = side;}
    public void setWidth(double side) {this.width = side;}

    //реализация метода для вывода информации путем добавления уникальной информации класса
    public String toString()
    {
        return "color: " + color + ", is filled: " + filled + ", side: " + side;
    }
}
