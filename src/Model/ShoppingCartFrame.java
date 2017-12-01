package Model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShoppingCartFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	

	/**
	 * Create the frame.
	 */
	public ShoppingCartFrame(User usr, ShoppingCart shp) {
		setBackground(UIManager.getColor("Desktop.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image card = new ImageIcon(this.getClass().getResource("/creditcard.png")).getImage();
		Image transf = new ImageIcon(this.getClass().getResource("/bank.png")).getImage();
		
		String[] columnNames = {"Nombre",
                "Nombre",
                "Precio",
               	};
		Object[][] data = new Object[Window.users.size()][3] ;
		
		table = new JTable(data, columnNames);
		table.setBounds(27, 12, 391, 133);
		contentPane.add(table);
		
		JTextPane txtpnSubtotal = new JTextPane();
		txtpnSubtotal.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnSubtotal.setForeground(new Color(255, 0, 0));
		txtpnSubtotal.setText("Subtotal:");
		txtpnSubtotal.setBounds(37, 162, 88, 21);
		contentPane.add(txtpnSubtotal);
		
		JTextPane txtpnSeleccioneM = new JTextPane();
		txtpnSeleccioneM.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnSeleccioneM.setText("Seleccione método de pago");
		txtpnSeleccioneM.setBounds(122, 195, 205, 21);
		contentPane.add(txtpnSeleccioneM);
		
		JButton btnNewButton = new JButton("Tarjeta de debito/credito");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardMethod cdm = new CardMethod(usr, shp);
				cdm.setVisible(true);
				cdm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton.setBackground(UIManager.getColor("Desktop.background"));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(12, 218, 195, 113);
		Image carro = new ImageIcon(this.getClass().getResource("/creditcard.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(carro));
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Transferencia bancaria");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TransferMethod tm = new TransferMethod(usr, shp);
				tm.setVisible(true);
				tm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setVisible(false);
				dispose();
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 11));
		button.setBackground(UIManager.getColor("Desktop.background"));
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setBounds(243, 218, 195, 113);
		Image bank = new ImageIcon(this.getClass().getResource("/bank.png")).getImage();
		button.setIcon(new ImageIcon(bank));
		contentPane.add(button);
		
		JButton button_1 = new JButton("Efectivo");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CashMethod cm = new CashMethod(usr, shp);
				cm.setVisible(true);
				cm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setVisible(false);
				dispose();
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 11));
		button_1.setBackground(UIManager.getColor("Desktop.background"));
		button_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setBounds(12, 338, 195, 113);
		Image cash = new ImageIcon(this.getClass().getResource("/cash2.png")).getImage();
		button_1.setIcon(new ImageIcon(cash));
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Reservar");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(new JFrame(), "Compra reservada. Correo enviado a " + usr.getMail(), "Gracias por su compra", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 11));
		button_2.setBackground(UIManager.getColor("Desktop.background"));
		button_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		button_2.setHorizontalTextPosition(SwingConstants.CENTER);
		button_2.setBounds(243, 338, 195, 113);
		Image ok = new ImageIcon(this.getClass().getResource("/oks.png")).getImage();
		button_2.setIcon(new ImageIcon(ok));
		contentPane.add(button_2);
	}
	

}
