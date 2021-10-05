package ru.mirea.task8.t3;
import javax.swing.*;
import java.awt.*;

public class t3
{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("test");
                frame.setSize(800, 400);

                JLabel jLabel = new JLabel("test");
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\nik_v\\JavaFirstMirea\\src\\ru\\mirea\\task8\\t3\\g.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);

                frame.add(jLabel);

                frame.setVisible(true);
            }
        });
    }
}