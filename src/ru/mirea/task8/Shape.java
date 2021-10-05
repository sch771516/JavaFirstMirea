package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Shape extends JPanel
{
    private String color1;
    private String color2;
    private String color3;

    private int posX;
    private int posY;

    public Shape()
    {
        this.color1 = "Green";
        this.posX = 0;
        this.posY = 0;
    }

    public void paintComponent(Graphics g)
    {
        this.setBackground(Color.black);// окрашиваем окно в черный цвет

        g.setColor(Color.PINK);
        g.draw3DRect(posX,posY,100,100,true);

        posX+=150;

        g.setColor(Color.BLACK);
        g.draw3DRect(posX,posY,100,100,true);

        posX+=150;

        g.setColor(Color.YELLOW);
        g.draw3DRect(posX,posY,100,100,true);

        posX+=150;

        g.setColor(Color.CYAN);
        g.draw3DRect(posX,posY,100,100,true);

        posY += 150;
        posX = 0;

        g.setColor(Color.CYAN);
        g.drawOval(posX,posY,100, 70);

        posX+= 150;

        g.setColor(Color.CYAN);
        g.drawOval(posX,posY,100, 70);

        posX+= 150;

        g.setColor(Color.GREEN);
        g.drawOval(posX,posY,100, 70);
        g.fillRect(posX,posY+250, 70,200);

        posX+= 150;

        g.setColor(Color.YELLOW);
        g.drawOval(posX,posY,100, 70);

        g.setColor(Color.YELLOW);
        g.fillRect(600,300,50,70);
        g.fill3DRect(0,0,50,100,true);
        g.fillRect(670,380,500,707);



//        posX+=150;
//
//        g.setColor(Color.black);
//        g.draw3DRect(posX,posY,100,100,true);
//
//        g.setColor(Color.black);
//        g.draw3DRect(posX,posY,50,50,true);
        }
}
