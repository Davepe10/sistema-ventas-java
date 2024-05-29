package seccionConfiguracion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;

import javax.swing.JButton;

public class configurarCuota implements ActionListener {

	private JFrame frmConfigurarCuotaDiaria;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarCuota window = new configurarCuota();
					window.frmConfigurarCuotaDiaria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public configurarCuota() {
		initialize();
		mostrarInformacion();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfigurarCuotaDiaria = new JFrame();
		frmConfigurarCuotaDiaria.setTitle("Configurar cuota diaria");
		frmConfigurarCuotaDiaria.setBounds(100, 100, 468, 158);
		frmConfigurarCuotaDiaria.setVisible(true);
		frmConfigurarCuotaDiaria.setLocationRelativeTo(null);
		frmConfigurarCuotaDiaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmConfigurarCuotaDiaria.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cuota  diaria esperada (S/ )");
		lblNewLabel.setBounds(10, 51, 158, 14);
		frmConfigurarCuotaDiaria.getContentPane().add(lblNewLabel);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(191, 48, 107, 20);
		frmConfigurarCuotaDiaria.getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(341, 47, 89, 23);
		btnAceptar.addActionListener(this);
		frmConfigurarCuotaDiaria.getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(341, 72, 89, 23);
		frmConfigurarCuotaDiaria.getContentPane().add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCancelar) {
			cerrar();
		}

		if (e.getSource() == btnAceptar) {
			modificarDatos();
		}
	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmConfigurarCuotaDiaria.dispose();
	}

	private void mostrarInformacion() {

		txtCantidad.setText(String.valueOf(datosProductos.cuotaDiaria));

		habilitarEdicion();
	}

	private void modificarDatos() {

		datosProductos.cuotaDiaria = Double.parseDouble(txtCantidad.getText());

		frmConfigurarCuotaDiaria.dispose();
	}

	private void habilitarEdicion() {

		txtCantidad.setEditable(true);

	}

}
