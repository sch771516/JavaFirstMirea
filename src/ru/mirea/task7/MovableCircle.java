package ru.mirea.task7;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp(){center.y = center.y + center.ySpeed;}
    public void moveDown(){center.y = center.y - center.ySpeed;}
    public void moveLeft(){center.x = center.x - center.xSpeed;}
    public void moveRight(){center.x = center.x + center.xSpeed;}

    public String toString()
    {
        return "x: " + center.x + ", y: " + center.y + ", xSpeed: " + center.xSpeed + ", ySpeed: " + center.ySpeed;
    }
}
