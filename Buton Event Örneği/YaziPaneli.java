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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author hanife
 */
public class YaziPaneli extends JFrame{
    private JPanel yaziPaneli=new JPanel();
    private JTextField metinAlani=new JTextField(15);
    public YaziPaneli(){
    FlowLayout fl=new FlowLayout(FlowLayout.LEFT,10,20);
    yaziPaneli.setLayout(fl);
    yaziPaneli.setBackground(Color.CYAN);
    JLabel label=new JLabel("Adınız:");
    yaziPaneli.add(label);
    JTextField ft=new JTextField(15);
    yaziPaneli.add(ft);
    label.setToolTipText("Adınızı giriniz");
    JLabel label1=new JLabel("Soyadınız:");
    yaziPaneli.add(label1);
    JTextField ft1=new JTextField(15);
    yaziPaneli.add(ft1);
    label1.setToolTipText("Soyadınızı giriniz");
    JLabel label2=new JLabel("Cinsiyetiniz");
    label2.setToolTipText("Cinsiyetinizi seçiniz");
    yaziPaneli.add(label2);
    JRadioButton bay=new JRadioButton("Bay");
    yaziPaneli.add(bay);
    JRadioButton bayan=new JRadioButton("Bayan");
    yaziPaneli.add(bayan);
    JButton gonder=new JButton("Gönder");
    yaziPaneli.add(gonder);
    ButonDinleyici dinleyici=new ButonDinleyici();
    gonder.addActionListener((ActionListener)dinleyici);
    add(yaziPaneli);
}
    private class ButonDinleyici implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Bilgileri doldurdugunuz için tesekkurler");
        }
    }
}
