/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
/**
 *
 * @author hanife
 */
public class Panel extends JFrame{
    public Panel()
    {
     JPanel panel=new JPanel();
     FlowLayout ly=new FlowLayout(FlowLayout.LEFT,10,10);
     panel.setLayout(ly);
     panel.add(new JButton("Buton1"));
     add(panel);
    }
}
