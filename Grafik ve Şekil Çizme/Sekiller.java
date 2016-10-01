/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author hanife
 */
public class Sekiller extends JPanel{
    @Override protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.setFont(new Font("Tahoma",Font.BOLD,30));
        g.drawLine(0, 0, 130, 90);
        g.drawString("HELLO",100,70);
        g.fill3DRect(75, 114, 160, 123, true);
    }
}
