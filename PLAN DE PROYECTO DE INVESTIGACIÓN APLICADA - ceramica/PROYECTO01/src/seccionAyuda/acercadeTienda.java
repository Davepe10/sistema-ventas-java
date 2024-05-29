package seccionAyuda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import paginaPrincipal.menuprincipal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class acercadeTienda implements ActionListener {

	private JFrame frmAcercaDeTienda;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acercadeTienda window = new acercadeTienda();
					window.frmAcercaDeTienda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public acercadeTienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcercaDeTienda = new JFrame();
		frmAcercaDeTienda.setTitle("Acerca de Tienda");
		frmAcercaDeTienda.setBounds(100, 100, 450, 423);
		frmAcercaDeTienda.setVisible(true);
		frmAcercaDeTienda.setLocationRelativeTo(null);
		frmAcercaDeTienda.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAcercaDeTienda.getContentPane().setLayout(null);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(171, 338, 89, 23);
		btnCerrar.addActionListener(this);
		frmAcercaDeTienda.getContentPane().add(btnCerrar);

		JLabel lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(149, 34, 126, 37);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("_________________________________________________________");
		lblNewLabel_1.setBounds(10, 69, 414, 14);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Autores");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(182, 121, 64, 14);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Integrante 1");
		lblNewLabel_3.setBounds(115, 175, 145, 14);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Integrante 2");
		lblNewLabel_4.setBounds(115, 215, 153, 14);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Integrante 3");
		lblNewLabel_5.setBounds(116, 255, 159, 14);
		frmAcercaDeTienda.getContentPane().add(lblNewLabel_5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCerrar) {
			Salir();
		}
	}

	private void Salir() {
		// TODO Auto-generated method stub
		frmAcercaDeTienda.dispose();
	}

}
