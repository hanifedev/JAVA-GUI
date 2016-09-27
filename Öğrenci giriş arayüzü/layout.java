/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author hanife
 */
public class layout extends JFrame{
    public layout()
    {
        FlowLayout layout=new FlowLayout(FlowLayout.LEFT, 10,20);
        setLayout(layout);
        add(new JLabel("Öğrenci No:"));
        add(new JTextField(15));
        add(new JLabel("Parola:"));
        add(new JTextField(15));
        add(new JButton("GİRİŞ"));
    }
    
}
