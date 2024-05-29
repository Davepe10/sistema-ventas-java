package seccionConfiguracion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;

import javax.swing.JLabel;
import javax.swing.JButton;

public class configurarObsequio implements ActionListener{

	private JFrame frmConfigurarObsequios;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JTextField txtObsequio4;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarObsequio window = new configurarObsequio();
					window.frmConfigurarObsequios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public configurarObsequio() {
		initialize();
		mostrarInformacion();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfigurarObsequios = new JFrame();
		frmConfigurarObsequios.setTitle("Configurar obsequios");
		frmConfigurarObsequios.setBounds(100, 100, 450, 260);
		frmConfigurarObsequios.setLocationRelativeTo(null);
		frmConfigurarObsequios.setVisible(true);
		frmConfigurarObsequios.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmConfigurarObsequios.getContentPane().setLayout(null);
		
		txtObsequio1 = new JTextField();
		txtObsequio1.setBounds(148, 43, 86, 20);
		frmConfigurarObsequios.getContentPane().add(txtObsequio1);
		txtObsequio1.setColumns(10);
		
		txtObsequio2 = new JTextField();
		txtObsequio2.setBounds(148, 87, 86, 20);
		frmConfigurarObsequios.getContentPane().add(txtObsequio2);
		txtObsequio2.setColumns(10);
		
		txtObsequio3 = new JTextField();
		txtObsequio3.setBounds(148, 130, 86, 20);
		frmConfigurarObsequios.getContentPane().add(txtObsequio3);
		txtObsequio3.setColumns(10);
		
		txtObsequio4 = new JTextField();
		txtObsequio4.setBounds(148, 169, 86, 20);
		frmConfigurarObsequios.getContentPane().add(txtObsequio4);
		txtObsequio4.setColumns(10);
		
		JLabel lblObsequio1 = new JLabel("Tipo de obsequio");
		lblObsequio1.setBounds(10, 46, 107, 14);
		frmConfigurarObsequios.getContentPane().add(lblObsequio1);
		
		JLabel lblObsequio2 = new JLabel("1 a 5 unidades");
		lblObsequio2.setBounds(10, 90, 107, 14);
		frmConfigurarObsequios.getContentPane().add(lblObsequio2);
		
		JLabel lblObsequio3 = new JLabel("6 a 10 unidades");
		lblObsequio3.setBounds(10, 133, 107, 14);
		frmConfigurarObsequios.getContentPane().add(lblObsequio3);
		
		JLabel lblObsequio4 = new JLabel("11 a m\u00E1s unidades");
		lblObsequio4.setBounds(10, 172, 107, 14);
		frmConfigurarObsequios.getContentPane().add(lblObsequio4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(313, 42, 89, 33);
		frmConfigurarObsequios.getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(313, 86, 89, 33);
		frmConfigurarObsequios.getContentPane().add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCancelar) {
			cerrar();
		}
		
		
		if(e.getSource() == btnAceptar) {
			modificarDatos();
		}
	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmConfigurarObsequios.dispose();
	}

	
	
	private void mostrarInformacion() {
	
		txtObsequio1.setText(String.valueOf(datosProductos.tipoObsequio));
		txtObsequio2.setText(String.valueOf(datosProductos.obsequioCantidad1));
		txtObsequio3.setText(String.valueOf(datosProductos.obsequioCantidad2));
		txtObsequio4.setText(String.valueOf(datosProductos.obsequioCantidad3));
		habilitarEdicion();
	}
	
	
	private void modificarDatos() {
		
		datosProductos.tipoObsequio = (txtObsequio1.getText());
		datosProductos.obsequioCantidad1 = Integer.parseInt(txtObsequio2.getText());
		datosProductos.obsequioCantidad1 = Integer.parseInt(txtObsequio3.getText());
		datosProductos.obsequioCantidad1 = Integer.parseInt(txtObsequio4.getText());
		
		frmConfigurarObsequios.dispose();
	}
	
	
	private void habilitarEdicion() {

		txtObsequio1.setEditable(true);
		txtObsequio2.setEditable(true);
		txtObsequio3.setEditable(true);
		txtObsequio4.setEditable(true);
		
	}
}
