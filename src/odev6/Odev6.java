package odev6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Odev6 extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JButton kh;
    private JButton visible1;
    private JButton visible2;

    Odev6()
    {
        add(panel);
        setSize(500,500);
        setTitle("Odev6");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Random random = new Random();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int randomnumara1 = random.nextInt(300);
                int randomnumara2 = random.nextInt(300);
                int redb = random.nextInt(256);
                int greenb = random.nextInt(256);
                int blueb = random.nextInt(256);
                int redf = random.nextInt(256);
                int greenf = random.nextInt(256);
                int bluef = random.nextInt(256);

                kh.setBounds(randomnumara1,randomnumara2,150,50);
                kh.setBackground(new Color(redb,greenb,blueb));
                kh.setForeground(new Color(redf,greenf,bluef));



            }
        });
        visible1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kh.setVisible(true);
            }
        });
        visible2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kh.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Odev6 odevim = new Odev6();
                odevim.setVisible(true);
            }
        });
    }


}
