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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        olaylar olay=new olaylar();
        olay.setSize(200,200);
        olay.setTitle("Deneme");
        olay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        olay.setLocationRelativeTo(null);
        olay.setVisible(true);
    }
    
}
