package seccionConfiguracion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;

import javax.swing.JButton;

public class configurarCantidad implements ActionListener {

	private JFrame frmConfigurarCantidadptima;
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
					configurarCantidad window = new configurarCantidad();
					window.frmConfigurarCantidadptima.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public configurarCantidad() {
		initialize();
		mostrarInformacion();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfigurarCantidadptima = new JFrame();
		frmConfigurarCantidadptima.setTitle("Configurar cantidad \u00F3ptima");
		frmConfigurarCantidadptima.setBounds(100, 100, 450, 178);
		frmConfigurarCantidadptima.setVisible(true);
		frmConfigurarCantidadptima.setLocationRelativeTo(null);
		frmConfigurarCantidadptima.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmConfigurarCantidadptima.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblNewLabel.setBounds(10, 46, 200, 14);
		frmConfigurarCantidadptima.getContentPane().add(lblNewLabel);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(217, 39, 48, 28);
		frmConfigurarCantidadptima.getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(315, 39, 89, 28);
		btnAceptar.addActionListener(this);
		frmConfigurarCantidadptima.getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(315, 78, 89, 28);
		btnCancelar.addActionListener(this);
		frmConfigurarCantidadptima.getContentPane().add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == btnAceptar) {
			modificarDatos();
		}

		if (e.getSource() == btnCancelar) {
			cerrar();
		}
	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmConfigurarCantidadptima.dispose();
	}

	private void mostrarInformacion() {

		txtCantidad.setText(String.valueOf(datosProductos.cantidadOptima));

		habilitarEdicion();
	}

	private void modificarDatos() {

		datosProductos.cantidadOptima = Integer.parseInt(txtCantidad.getText());

		frmConfigurarCantidadptima.dispose();
	}

	private void habilitarEdicion() {

		txtCantidad.setEditable(true);

	}

}
