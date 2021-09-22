package ru.mirea.task3.Circle;
import java.lang.*;

public class Circle
{
    private double rad;
    private double C;
    private double l;
    private double S;

    public Circle(double rad)
    {
        this.rad = rad;
    }
    public Circle(double rad, double C, double l, double S)
    {
        this.rad = rad;
        this.C = C;
        this.l = l;
        this.S = S;
    }

    public void setRad(double rad){this.rad = rad;}
    public void setC(double C){this.C = C;}
    public void setL(double l){this.l = l;}
    public void setS(double S){this.S = S;}

    public double getRad(){return rad;}
    public double getC(){return C;}
    public double getL(){return l;}
    public double getS(){return S;}

    //длина окружности
    public double C(int rad)
    {
        return 2 * 3.14 * rad;
    }
    //длина дуги
    public double l(int rad, int corn)
    {
        return (3.14 * rad * corn) / 180 ;
    }
    //площадь
    public double S(int rad)
    {
        return 3.14 * rad * rad;
    }

    public String toString()
    {
        return "Радиус: " + this.rad
        + " Длина окружности: " + this.C
        + " Длина дуги: " + this.l
        + " Площадь круга: " + this.S + "";

    }
}
