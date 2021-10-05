package ru.mirea.task8.t2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class testT2
{
    public static void main(String[] args) throws IOException
    {
        String imagePath = "C:\\Users\\nik_v\\JavaFirstMirea\\src\\ru\\mirea\\task8\\t2\\pict\\pict.jpg";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));

        Graphics2D g = (Graphics2D) myPicture.getGraphics();
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);

        JFrame f = new JFrame();
        f.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
        f.add(jPanel);
        f.setVisible(true);
    }
}
