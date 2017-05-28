import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingUygulama4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUygulama4 window = new SwingUygulama4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingUygulama4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 55, 146);
		frame.getContentPane().add(panel);
		
		JRadioButton rdb12 = new JRadioButton("12");
		panel.add(rdb12);
		
		JRadioButton rdb14 = new JRadioButton("14");
		panel.add(rdb14);
		
		JRadioButton rdb16 = new JRadioButton("16");
		panel.add(rdb16);
		
		JRadioButton rdb18 = new JRadioButton("18");
		panel.add(rdb18);
		
		JRadioButton rdb20 = new JRadioButton("20");
		panel.add(rdb20);
		
		//-- Radio Buttonlarin Gruplandirilmasi
		
		ButtonGroup butonGroups = new ButtonGroup();
		butonGroups.add(rdb12);
		butonGroups.add(rdb14);
		butonGroups.add(rdb16);
		butonGroups.add(rdb18);
		butonGroups.add(rdb20);
		
		JCheckBox chckbxBold = new JCheckBox("Bold");
		chckbxBold.setBounds(71, 11, 97, 23);
		frame.getContentPane().add(chckbxBold);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 41, 306, 116);
		frame.getContentPane().add(textArea);
		
		JButton btnDuzenle = new JButton("D\u00FCzenle");
		btnDuzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int boyut = 0;
				if(rdb12.isSelected())
					boyut = Integer.parseInt(rdb12.getText());
				else if(rdb14.isSelected())
					boyut = Integer.parseInt(rdb14.getText());
				else if(rdb16.isSelected())
					boyut = Integer.parseInt(rdb16.getText());
				else if(rdb18.isSelected())
					boyut = Integer.parseInt(rdb18.getText());
				else if(rdb20.isSelected())
					boyut = Integer.parseInt(rdb20.getText());
			Font font;
			if(chckbxBold.isSelected())
				font = new Font("SansSerif",Font.BOLD, boyut);
			else
				font = new Font("SansSerif",Font.PLAIN, boyut);
		    textArea.setFont(font);
			}
		});
		btnDuzenle.setBounds(289, 168, 89, 23);
		frame.getContentPane().add(btnDuzenle);
		
		JButton btnCikis = new JButton("\u00C7\u0131k\u0131\u015F");
		btnCikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCikis.setBounds(190, 168, 89, 23);
		frame.getContentPane().add(btnCikis);
	}
}
