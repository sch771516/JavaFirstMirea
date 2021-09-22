package ru.mirea.task3.Human;
import java.util.Scanner;

public class Human
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int leftLegStep, rightLegStep;
        System.out.print("Введите количество пальцев на ноге:");
        i = sc.nextInt();
        System.out.print("Введите размер ноги:");
        j = sc.nextInt();
        Leg leftLeg = new Leg(i,j);

        System.out.print("Шаг левой ногой-");
        leftLegStep = sc.nextInt();

        System.out.print("Шаг правой ногой-");
        rightLegStep = sc.nextInt();

        if((rightLegStep + leftLegStep) == 2)
        {
            System.out.println("Ты прошел метр");
        }else
        {
            if((rightLegStep + leftLegStep) == 1)
            {
                System.out.println("Ты сделал только один шаг");
            }else
            {
                System.out.println("Ты стоишь на месте(");

            }
        }
        int degree, foo;
        System.out.print("В какую сторону поворачиваем голову?");
        foo = sc.nextInt();
        System.out.print("На сколько градусов?");
        degree = sc.nextInt();
        Head head = new Head();
        head.turn(foo,degree);


    }
}
