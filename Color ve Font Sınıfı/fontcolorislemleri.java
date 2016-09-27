/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
/**
 *
 * @author hanife
 */
public class fontcolorislemleri extends JFrame{
    public fontcolorislemleri()
    {
    JButton west=new JButton("WEST");
    Color renk=new Color(100,150,250);
    west.setBackground(renk);
    BorderLayout layout=new BorderLayout();
    setLayout(layout);
    JButton center=new JButton("HANIFE");
    center.setBackground(Color.YELLOW);
    add(center,BorderLayout.CENTER);
    add(new JButton("SOUTH"),BorderLayout.SOUTH);
    add(new JButton("NORTH"),BorderLayout.NORTH);
    add(west,BorderLayout.WEST);
    JButton east=new JButton("EAST");
    east.setBackground(Color.PINK);
    add(east,BorderLayout.EAST);
    Font yazi=new Font("Tahoma", Font.BOLD,18);
    east.setFont(yazi);
    }  
}