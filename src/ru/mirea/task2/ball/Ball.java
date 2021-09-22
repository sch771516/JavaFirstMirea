package ru.mirea.task2.ball;

public class Ball
{
    private String brand;
    private int age;

    public Ball(String n,int a)
    {
        brand = n;
        age = a;
    }

    public Ball(String n)
    {
        brand = n;
        age = 0;
    }
    public Ball()
    {
        brand = "ball";
        age = 0;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getBrand(String brand)
    {
        return brand;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return this.brand+", age "+this.age;
    }
    public void show(){
        System.out.println(brand+"'s ball is "+age+" years old");
    }
}
