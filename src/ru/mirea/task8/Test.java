package ru.mirea.task8;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;

public class Test
{
    public static void  main(String[] args)
    {
        JFrame frame = new JFrame("My first frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Toolkit tool = Toolkit.getDefaultToolkit();
        //Dimension dm = tool.getScreenSize();

        Shape shp = new Shape();
        shp.setBackground(Color.WHITE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.add(shp);



    }
}