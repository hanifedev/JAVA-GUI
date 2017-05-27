import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingUygulama2 {

	private JFrame frmUygulama;
	private JTextField txtGiris;
	private JTextField txtCikis;
	private JButton btnAktif;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUygulama2 window = new SwingUygulama2();
					window.frmUygulama.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingUygulama2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUygulama = new JFrame();
		frmUygulama.setTitle("Uygulama 2");
		frmUygulama.setBounds(100, 100, 450, 174);
		frmUygulama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUygulama.getContentPane().setLayout(null);
		
		txtGiris = new JTextField();
		txtGiris.setBounds(10, 11, 384, 20);
		frmUygulama.getContentPane().add(txtGiris);
		txtGiris.setColumns(10);
		
		JButton btnBuyut = new JButton("Karakter Buyut");
		btnBuyut.setForeground(Color.MAGENTA);
		btnBuyut.setToolTipText("Karakter Butonu");
		btnBuyut.setEnabled(false);
		btnBuyut.setBackground(Color.LIGHT_GRAY);
		btnBuyut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String metin = txtGiris.getText();
				txtCikis.setText(metin.toUpperCase());
			}
		});
		btnBuyut.setBounds(246, 53, 148, 23);
		frmUygulama.getContentPane().add(btnBuyut);
		
		txtCikis = new JTextField();
		txtCikis.setHorizontalAlignment(SwingConstants.CENTER);
		txtCikis.setForeground(Color.RED);
		txtCikis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCikis.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		txtCikis.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCikis.setBackground(Color.PINK);
		txtCikis.setEditable(false);
		txtCikis.setBounds(10, 87, 384, 37);
		frmUygulama.getContentPane().add(txtCikis);
		txtCikis.setColumns(10);
		
		btnAktif = new JButton("Aktif Et");
		btnAktif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBuyut.setEnabled(true);
			}
		});
		btnAktif.setBounds(38, 53, 111, 23);
		frmUygulama.getContentPane().add(btnAktif);
	}
}
