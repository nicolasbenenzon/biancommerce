package Model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;

public class ProductTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextPane txtpnRfg;


	/**
	 * Create the frame.
	 */
	public ProductTable(Category cat) {
		setBackground(UIManager.getColor("Desktop.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnNames = {"Nombre",
                "Descripcion",
                "Imagen", "Precio", "Stock"
               	};
		Object[][] data = new Object[3][5] ;
		/*int i =0;
		
		for(User u: Window.users) {
			data[i][0] = u.getName();
			data[i][1] = u.getDni();	
			data[i][2] = u.getMail();
			i++;
		}*/
		
		table = new JTable(data, columnNames);
		table.setCellSelectionEnabled(true);
		table.setBounds(12, 158, 776, 393);
		contentPane.add(table);
		
		JTextPane txtpnSeleccioneLosProductos = new JTextPane();
		txtpnSeleccioneLosProductos.setEditable(false);
		txtpnSeleccioneLosProductos.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtpnSeleccioneLosProductos.setText("Seleccione los productos que desea agregar a su carrito");
		txtpnSeleccioneLosProductos.setBounds(12, 12, 584, 21);
		contentPane.add(txtpnSeleccioneLosProductos);
		
		JTextPane txtpnParaSalirDe = new JTextPane();
		txtpnParaSalirDe.setEditable(false);
		txtpnParaSalirDe.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtpnParaSalirDe.setText("Para salir de esta categoria cierre la ventana");
		txtpnParaSalirDe.setBounds(12, 45, 438, 21);
		contentPane.add(txtpnParaSalirDe);
		
		txtpnRfg = new JTextPane();
		txtpnRfg.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnRfg.setEditable(false);
		txtpnRfg.setText(cat.getName() + " - " + cat.getDescription());
		txtpnRfg.setBounds(25, 94, 506, 21);
		contentPane.add(txtpnRfg);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(602, 0, 192, 115);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(cat.getImage()));
	}
}
