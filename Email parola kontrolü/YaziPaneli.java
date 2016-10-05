/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author hanife
 */
public class YaziPaneli extends JFrame{
    private JPanel yaziPaneli=new JPanel();
    private JTextField metinAlani=new JTextField(15);
    public JTextField ft=new JTextField(15);
    public JTextField ft1=new JTextField(15);
    public YaziPaneli(){
    FlowLayout fl=new FlowLayout(FlowLayout.LEFT,10,20);
    yaziPaneli.setLayout(fl);
    yaziPaneli.setBackground(Color.CYAN);
    JLabel label=new JLabel("Mail adresi:");
    yaziPaneli.add(label);
    //JTextField ft=new JTextField(15);
    yaziPaneli.add(ft);
    label.setToolTipText("Mail adresini giriniz");
    JLabel label1=new JLabel("Parola:");
    yaziPaneli.add(label1);        
    //JTextField ft1=new JTextField(15);
    yaziPaneli.add(ft1);
    label1.setToolTipText("Parolanızı giriniz");
    JButton gonder=new JButton("Gönder");
    yaziPaneli.add(gonder);
    ButonDinleyici dinleyici=new ButonDinleyici();
    gonder.addActionListener((ActionListener)dinleyici);
    add(yaziPaneli);
}
    private class ButonDinleyici implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if ("deneme@hotmail.com".equals(ft.getText()) && "1234".equals(ft1.getText()))
            {
            JFrame pncr=new JFrame();
            FlowLayout flow=new FlowLayout();
            pncr.setLayout(flow);
            pncr.add(new JLabel("HOSGELDİNİZ"));
            pncr.setSize(300,300);
            pncr.setTitle("Yeni pencere");
            pncr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pncr.setLocationRelativeTo(null);
            pncr.setVisible(true);
            }
            else
            {
                System.out.println("Yanlış girdiniz!");
            }
        }
    }
}
