import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ilkuygulama {

	private JFrame frmAnaMenu;
	private JTextField txtAdiniz;
	private JTextField txtSoyadiniz;
	private JTextField txtDYili;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ilkuygulama window = new ilkuygulama();
					window.frmAnaMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ilkuygulama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnaMenu = new JFrame();
		frmAnaMenu.setTitle("Java Form Uygulama");
		frmAnaMenu.setBounds(100, 100, 450, 300);
		frmAnaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnaMenu.getContentPane().setLayout(null);
		
		JLabel lblAdiniz = new JLabel("Ad\u0131n\u0131z:");
		lblAdiniz.setBounds(10, 25, 54, 14);
		frmAnaMenu.getContentPane().add(lblAdiniz);
		
		JLabel lblSoyadiniz = new JLabel("Soyad\u0131n\u0131z:");
		lblSoyadiniz.setBounds(10, 57, 54, 14);
		frmAnaMenu.getContentPane().add(lblSoyadiniz);
		
		JLabel lblDYili = new JLabel("Do\u011Fum Y\u0131l\u0131:");
		lblDYili.setBounds(10, 90, 60, 14);
		frmAnaMenu.getContentPane().add(lblDYili);
		
		txtAdiniz = new JTextField();
		txtAdiniz.setBounds(99, 22, 86, 20);
		frmAnaMenu.getContentPane().add(txtAdiniz);
		txtAdiniz.setColumns(10);
		
		txtSoyadiniz = new JTextField();
		txtSoyadiniz.setBounds(99, 54, 86, 20);
		frmAnaMenu.getContentPane().add(txtSoyadiniz);
		txtSoyadiniz.setColumns(10);
		
		txtDYili = new JTextField();
		txtDYili.setBounds(99, 87, 86, 20);
		frmAnaMenu.getContentPane().add(txtDYili);
		txtDYili.setColumns(10);
		
		JTextArea txtSonuc = new JTextArea();
		txtSonuc.setBounds(229, 20, 130, 84);
		frmAnaMenu.getContentPane().add(txtSonuc);
		
		JButton btnGoster = new JButton("G\u00F6ster");
		btnGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ad = txtAdiniz.getText();
				String soyad = txtSoyadiniz.getText();
				int dyili = Integer.parseInt(txtDYili.getText());
				int yas = 2017 - dyili;
				String sonuc = "Adiniz: " + ad + "Soyadiniz: " + soyad + "\nYasiniz: " + String.valueOf(yas);
				txtSonuc.setText(sonuc);
			}
		});
		btnGoster.setBounds(99, 118, 89, 23);
		frmAnaMenu.getContentPane().add(btnGoster);
	}
}
