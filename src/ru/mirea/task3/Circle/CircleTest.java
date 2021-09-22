package ru.mirea.task3.Circle;
import java.util.Scanner;
import java.lang.*;

public class CircleTest
{
    public static void main(String[] args)
    {
        int rad, corn;
        System.out.println("Введите радиус и угол соответственно");
        Scanner sc = new Scanner(System.in);
        rad = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        corn = sc1.nextInt();

        Circle a = new Circle(rad);
        a.setC(a.C(rad));
        a.setL(a.l(rad , corn));
        a.setS(a.S(rad));

        System.out.println(a.toString());
    }
}
