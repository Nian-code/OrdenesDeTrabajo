package Graphic;


import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Graphic{

    public static void Graphic() {
        JFrame frame = new JFrame();
        frame.setSize(400, 150); // Tamaño de la ventana principal
        frame.setTitle("Orders work");

        JLabel withlove    = new JLabel("With ❤️ Nicoll");

        JButton tecnic    = new JButton("technical");
        JButton engineer  = new JButton("Engineer");
        JButton orderwork = new JButton("Orderwork");

        tecnic.setBounds(130,60,100, 40);
        engineer.setBounds(130,110,100, 40);
        orderwork.setBounds(130,160,100, 40);

        //orderwork.setBackground(Color.CYAN);
        tecnic.setVisible(true);
        engineer.setVisible(true);
        orderwork.setVisible(true);


        frame.add(tecnic);
        frame.add(engineer);
        frame.add(orderwork);


        withlove.setBounds(100, 10, 200, 50);
        JLabel label1 = new JLabel("");
        //withlove.setForeground(Color.MAGENTA);
        frame.add(withlove);
        frame.add(label1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //tecnic.addActionListener(this);

    }



}
