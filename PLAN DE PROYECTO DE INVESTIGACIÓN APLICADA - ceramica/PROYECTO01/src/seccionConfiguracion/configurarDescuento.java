package seccionConfiguracion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class configurarDescuento implements ActionListener {

	private JFrame frmConfigurarPorcentajesDe;
	private JTextField txtDescuento1;
	private JTextField txtDescuento2;
	private JTextField txtDescuento3;
	private JTextField txtDescuento4;
	private JButton btnAceptar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarDescuento window = new configurarDescuento();
					window.frmConfigurarPorcentajesDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public configurarDescuento() {
		initialize();
		mostrarInformacion();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfigurarPorcentajesDe = new JFrame();
		frmConfigurarPorcentajesDe.setTitle("Configurar porcentajes de descuento");
		frmConfigurarPorcentajesDe.setBounds(100, 100, 512, 259);
		frmConfigurarPorcentajesDe.setVisible(true);
		frmConfigurarPorcentajesDe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmConfigurarPorcentajesDe.setLocationRelativeTo(null);
		frmConfigurarPorcentajesDe.getContentPane().setLayout(null);

		JLabel lblDescuento1 = new JLabel("1 a 5 unidades");
		lblDescuento1.setBounds(23, 44, 95, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblDescuento1);

		JLabel lblDescuento2 = new JLabel("6 a 10 unidades");
		lblDescuento2.setBounds(23, 86, 95, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblDescuento2);

		JLabel lblDescuento3 = new JLabel("11 a 15 unidades");
		lblDescuento3.setBounds(23, 138, 95, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblDescuento3);

		JLabel lblDescuento4 = new JLabel("M\u00E1s de 15 unidades");
		lblDescuento4.setBounds(23, 180, 95, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblDescuento4);

		txtDescuento1 = new JTextField();
		txtDescuento1.setEditable(false);
		txtDescuento1.setBounds(128, 41, 86, 20);
		frmConfigurarPorcentajesDe.getContentPane().add(txtDescuento1);
		txtDescuento1.setColumns(10);

		txtDescuento2 = new JTextField();
		txtDescuento2.setEditable(false);
		txtDescuento2.setBounds(128, 83, 86, 20);
		frmConfigurarPorcentajesDe.getContentPane().add(txtDescuento2);
		txtDescuento2.setColumns(10);

		txtDescuento3 = new JTextField();
		txtDescuento3.setEditable(false);
		txtDescuento3.setBounds(128, 135, 86, 20);
		frmConfigurarPorcentajesDe.getContentPane().add(txtDescuento3);
		txtDescuento3.setColumns(10);

		txtDescuento4 = new JTextField();
		txtDescuento4.setEditable(false);
		txtDescuento4.setBounds(128, 177, 86, 20);
		frmConfigurarPorcentajesDe.getContentPane().add(txtDescuento4);
		txtDescuento4.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(224, 44, 46, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(224, 86, 46, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(224, 138, 46, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(224, 180, 46, 14);
		frmConfigurarPorcentajesDe.getContentPane().add(lblNewLabel_7);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(385, 36, 89, 31);
		btnAceptar.addActionListener(this);
		frmConfigurarPorcentajesDe.getContentPane().add(btnAceptar);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(385, 78, 89, 31);
		btnCerrar.addActionListener(this);
		frmConfigurarPorcentajesDe.getContentPane().add(btnCerrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == btnCerrar) {
			cerrar();
		}

		if (e.getSource() == btnAceptar) {
			modificarDatos();
		}

	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmConfigurarPorcentajesDe.dispose();
	}

	private void mostrarInformacion() {

		txtDescuento1.setText(String.valueOf(datosProductos.porcentaje1));
		txtDescuento2.setText(String.valueOf(datosProductos.porcentaje2));
		txtDescuento3.setText(String.valueOf(datosProductos.porcentaje3));
		txtDescuento4.setText(String.valueOf(datosProductos.porcentaje4));
		habilitarEdicion();
	}

	private void modificarDatos() {

		datosProductos.porcentaje1 = Double.parseDouble(txtDescuento1.getText());
		datosProductos.porcentaje2 = Double.parseDouble(txtDescuento2.getText());
		datosProductos.porcentaje3 = Double.parseDouble(txtDescuento3.getText());
		datosProductos.porcentaje4 = Double.parseDouble(txtDescuento4.getText());

		frmConfigurarPorcentajesDe.dispose();
	}

	private void habilitarEdicion() {

		txtDescuento1.setEditable(true);
		txtDescuento2.setEditable(true);
		txtDescuento3.setEditable(true);
		txtDescuento4.setEditable(true);

	}

}
