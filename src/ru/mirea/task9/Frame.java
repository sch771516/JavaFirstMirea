package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame
{
/*
    private JButton button = new JButton("Press me");
    private JLabel label = new JLabel("Input: ");

    public Frame()
    {
        super("My App");//запускаем конструктор jframe
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);

        button.addActionListener(new ButtonEvent());
        container.add(button);
    }
 class ButtonEvent implements ActionListener
 {
     //public void setterScore(ActionEvent f){}

     @Override
     public void actionPerformed(ActionEvent e)
     {

     }
}
*/


    public static void main(String[] args)
    {
        final int[] sc1 = {0};
        final int[] sc2 = {0};
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("1X BET");
        frame.setVisible(true);
        frame.setSize(600,70);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        FlowLayout lay1 = new FlowLayout();

        JLabel label1 = new JLabel("Result: ");
        JLabel label2 = new JLabel("0");
        JLabel label3 = new JLabel(" x ");
        JLabel label4 = new JLabel("0");

        JLabel label5 = new JLabel("   Last scorer: " + "N/A   ");

        JLabel label6 = new JLabel();

        //Менеджер размещения
        JButton button1 = new JButton("PSG");
        JButton button2 = new JButton("UVE");
        JButton button3 = new JButton("Winner");

        frame.setLayout(lay1);
       // button1.setLayout(lay1);
       // button2.setLayout(lay1);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);

        frame.add(button1);
        //button1.setSize(100,50);
        frame.add(button2);
        //button2.setSize(100,50);
        frame.add(button3);
        frame.add(label6);

        //Анонимные классы
        button1.addActionListener(new ActionListener()
        {
            public int score1 = 0;
            @Override
            public void actionPerformed(ActionEvent e)
            {
                score1++;
                label2.setText(String.valueOf(score1));
                label5.setText("   Last csorer: PSG!   ");
                sc1[0] = score1;
            }
        });
        button2.addActionListener(new ActionListener()
        { int score2 = 0;
            @Override
            public void actionPerformed(ActionEvent e)
            {
                score2++;
                label4.setText(String.valueOf(score2));
                label5.setText("   Last csorer: UVE!   ");
                sc2[0] = score2;
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sc1[0] > sc2[0])
                {
                    label6.setText("   PSG IS WINNER!");
                }
                else if(sc1[0] < sc2[0])
                {
                    label6.setText("   UVE IS WINNER!");
                }
                else
                {
                    label6.setText("   DRAW!");
                }
            }
        });


    }
}
