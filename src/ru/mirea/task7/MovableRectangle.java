package ru.mirea.task7;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint BottomRight;

    MovableRectangle(int x1, int y1, int x2 , int y2, int xSpeed, int ySpeed)
    {
        BottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    public void moveUp()
    {
       topLeft.y += topLeft.ySpeed;
        BottomRight.y +=  BottomRight.ySpeed;
    }
    public void moveDown()
    {
        topLeft.y -= topLeft.ySpeed;
        BottomRight.y -= BottomRight.ySpeed;
    }
    public void moveLeft()
    {
        topLeft.x -= topLeft.xSpeed;
        BottomRight.x -=  BottomRight.xSpeed;
    }
    public void moveRight()
    {
        topLeft.x += topLeft.xSpeed;
        BottomRight.x += BottomRight.xSpeed;
    }

    public String toString()
    {
        return "x1: " + topLeft.x + ", y1: " + topLeft.y +
                ", x2: " +  BottomRight.x + ", y2: " +  BottomRight.y +
                ", xSpeed: " + topLeft.xSpeed + ", ySpeed: " + BottomRight.ySpeed;
    }
}
