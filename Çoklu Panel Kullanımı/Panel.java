/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
/**
 *
 * @author hanife
 */
public class Panel extends JFrame{
    public Panel()
    {
        JPanel pnl=new JPanel();
        pnl.setLayout(new GridLayout(2,2));
        pnl.add(new JButton("buton1"));
        pnl.add(new JButton("buton2"));
        pnl.add(new JButton("buton3"));
        pnl.add(new JButton("buton4"));
        JPanel pnl2=new JPanel();
        pnl2.setLayout(new BorderLayout());
        pnl2.add(pnl,BorderLayout.CENTER);
        pnl2.add(new JButton("YAN"),BorderLayout.EAST);
        add(pnl2);
    }
}
