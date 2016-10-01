/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import javax.swing.JFrame;
/**
 *
 * @author hanife
 */
public class GrafikPanel extends JFrame{
    public GrafikPanel()
    {
        add(new Sekiller());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafikPanel pencere=new GrafikPanel();
        pencere.setTitle("penceremiz");
        pencere.setSize(300,300);
        pencere.setLocationRelativeTo(null);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
    
}