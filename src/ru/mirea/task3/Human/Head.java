package ru.mirea.task3.Human;

public class Head
{
    void turn(int r,int ang)
    {

        if(r == 1)
        {
            System.out.println("Голова повернута вправо на "+ ang + "гр.");
        }
        else
        {
            System.out.println("Голова повернута влево на "+ ang + "гр.");
        }
    }
}