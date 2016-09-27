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
        fontcolorislemleri pencere=new fontcolorislemleri();
        pencere.setTitle("DENEME");
        pencere.setSize(400,300);
        pencere.setLocationRelativeTo(null);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true); 
    }
    
}
