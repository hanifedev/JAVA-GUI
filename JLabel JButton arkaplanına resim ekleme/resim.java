/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author hanife
 */
public class resim extends JFrame{
    private ImageIcon resim=new ImageIcon(getClass().getResource("/resim/linux-tux-100404.jpg"));
    public resim()
    {
        setLayout(new GridLayout(2,2));
        add(new JLabel(resim));
        add(new JButton(resim));
    }
}
