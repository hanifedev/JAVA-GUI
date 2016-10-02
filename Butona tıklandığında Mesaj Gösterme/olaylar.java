/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
/**
 *
 * @author hanife
 */
public class olaylar extends JFrame{
    public olaylar()
    {
        setLayout(new FlowLayout());
        JButton buton=new JButton("MESAJI GÖSTER");
        buton.setBackground(Color.GREEN);
        Font font=new Font("Tahoma",Font.ITALIC,20);
        buton.setFont(font);
        add(buton);
        ButonDinleyici dinleyici=new ButonDinleyici();
        buton.addActionListener(dinleyici);
    }
    private class ButonDinleyici implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            System.out.println("Butona Tıkladınız");
        }
    }
}
