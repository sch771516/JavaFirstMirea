package ru.mirea.task2.ball;

import ru.mirea.task2.ball.Ball;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball d1 = new Ball("Nike", 2);
        Ball d2 = new Ball("Adidas", 7);
        Ball d3 = new Ball("Puma");
        d3.setAge(1);
        System.out.println(d1);
        d1.show();
        d2.show();
        d3.show();
    }
}
