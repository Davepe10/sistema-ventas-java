package seccionMantenimiento;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;
import paginaPrincipal.menuprincipal;

public class Modificarceramico implements ActionListener {

	private JFrame frmModificarCeramico;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnGrabar;
	private JButton btnCerrar;
	private JComboBox cboProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificarceramico window = new Modificarceramico();
					window.frmModificarCeramico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Modificarceramico() {
		initialize();
		cargarInformacion();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModificarCeramico = new JFrame();
		frmModificarCeramico.setTitle("Modificar Ceramico");
		frmModificarCeramico.setVisible(true);
		frmModificarCeramico.setBounds(100, 100, 450, 300);
		frmModificarCeramico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmModificarCeramico.setLocationRelativeTo(null);
		frmModificarCeramico.getContentPane().setLayout(null);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 24, 80, 14);
		frmModificarCeramico.getContentPane().add(lblModelo);

		JLabel lblPrecio = new JLabel("Precio(S/)");
		lblPrecio.setBounds(10, 59, 80, 14);
		frmModificarCeramico.getContentPane().add(lblPrecio);

		JLabel lblAncho = new JLabel("Ancho(cm)");
		lblAncho.setBounds(10, 103, 80, 14);
		frmModificarCeramico.getContentPane().add(lblAncho);

		JLabel lblLargo = new JLabel("Largo(cm)");
		lblLargo.setBounds(10, 142, 80, 14);
		frmModificarCeramico.getContentPane().add(lblLargo);

		JLabel lblEspesor = new JLabel("Espesor(mm)");
		lblEspesor.setBounds(10, 177, 80, 14);
		frmModificarCeramico.getContentPane().add(lblEspesor);

		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 212, 80, 14);
		frmModificarCeramico.getContentPane().add(lblContenido);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(105, 56, 185, 20);
		frmModificarCeramico.getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		cboProductos = new JComboBox();
		cboProductos.setBounds(105, 20, 185, 22);
		cboProductos.addItem(datosProductos.modelo0);
		cboProductos.addItem(datosProductos.modelo1);
		cboProductos.addItem(datosProductos.modelo2);
		cboProductos.addItem(datosProductos.modelo3);
		cboProductos.addItem(datosProductos.modelo4);
		cboProductos.addActionListener(this);
		frmModificarCeramico.getContentPane().add(cboProductos);

		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(105, 100, 185, 20);
		frmModificarCeramico.getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setBounds(105, 139, 185, 20);
		frmModificarCeramico.getContentPane().add(txtLargo);
		txtLargo.setColumns(10);

		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(105, 174, 185, 20);
		frmModificarCeramico.getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);

		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setBounds(105, 209, 185, 20);
		frmModificarCeramico.getContentPane().add(txtContenido);
		txtContenido.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(315, 20, 89, 23);
		btnCerrar.addActionListener(this);
		frmModificarCeramico.getContentPane().add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(315, 55, 89, 23);
		frmModificarCeramico.getContentPane().add(btnGrabar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnGrabar) {
			guardarInformacion();
		
		}
		if (e.getSource() == cboProductos) {
			cargarInformacion();
			habilitarEdicion();
			

		}
		if (e.getSource() == btnCerrar) {
			cerrarModificar();

		}
	}

	private void cerrarModificar() {
		// TODO Auto-generated method stub

		frmModificarCeramico.dispose();

	}

	private String leerProducto() {

		return cboProductos.getSelectedItem().toString();
	}

	private void guardarInformacion() {
		// TODO Auto-generated method stub
	
		String producto = leerProducto();

		if (producto == datosProductos.modelo0) {
			datosProductos.precio0 = Double.parseDouble(txtPrecio.getText());
			datosProductos.ancho0 = Double.parseDouble(txtAncho.getText());
			datosProductos.largo0 = Double.parseDouble(txtLargo.getText());
			datosProductos.espesor0 = Double.parseDouble(txtEspesor.getText());
			datosProductos.contenido0 = Integer.parseInt(txtContenido.getText());

		} else if (producto == datosProductos.modelo1) {
			datosProductos.precio1 = Double.parseDouble(txtPrecio.getText());
			datosProductos.ancho1 = Double.parseDouble(txtAncho.getText());
			datosProductos.largo1 = Double.parseDouble(txtLargo.getText());
			datosProductos.espesor1 = Double.parseDouble(txtEspesor.getText());
			datosProductos.contenido1 = Integer.parseInt(txtContenido.getText());

		} else if (producto == datosProductos.modelo2) {
			datosProductos.precio2 = Double.parseDouble(txtPrecio.getText());
			datosProductos.ancho2 = Double.parseDouble(txtAncho.getText());
			datosProductos.largo2 = Double.parseDouble(txtLargo.getText());
			datosProductos.espesor2 = Double.parseDouble(txtEspesor.getText());
			datosProductos.contenido2 = Integer.parseInt(txtContenido.getText());

		}

		else if (producto == datosProductos.modelo3) {
			datosProductos.precio3 = Double.parseDouble(txtPrecio.getText());
			datosProductos.ancho3 = Double.parseDouble(txtAncho.getText());
			datosProductos.largo3 = Double.parseDouble(txtLargo.getText());
			datosProductos.espesor3 = Double.parseDouble(txtEspesor.getText());
			datosProductos.contenido3 = Integer.parseInt(txtContenido.getText());
		}

		else if (producto == datosProductos.modelo4) {
			datosProductos.precio4 = Double.parseDouble(txtPrecio.getText());
			datosProductos.ancho4 = Double.parseDouble(txtAncho.getText());
			datosProductos.largo4 = Double.parseDouble(txtLargo.getText());
			datosProductos.espesor4 = Double.parseDouble(txtEspesor.getText());
			datosProductos.contenido4 = Integer.parseInt(txtContenido.getText()); 

		}

		frmModificarCeramico.dispose();
	}

	private void habilitarEdicion() {

		txtPrecio.setEditable(true);
		txtAncho.setEditable(true);
		txtLargo.setEditable(true);
		txtEspesor.setEditable(true);
		txtContenido.setEditable(true);
	}

	private void cargarInformacion() {
		// TODO Auto-generated method stub
	    String producto = leerProducto();

		if (producto == datosProductos.modelo0) {
			txtPrecio.setText(String.valueOf(datosProductos.precio0));
			txtAncho.setText(String.valueOf(datosProductos.ancho0));
			txtLargo.setText(String.valueOf(datosProductos.largo0));
			txtEspesor.setText(String.valueOf(datosProductos.espesor0));
			txtContenido.setText(String.valueOf(datosProductos.contenido0));
		} else if (producto == datosProductos.modelo1) {
			txtPrecio.setText(String.valueOf(datosProductos.precio1));
			txtAncho.setText(String.valueOf(datosProductos.ancho1));
			txtLargo.setText(String.valueOf(datosProductos.largo1));
			txtEspesor.setText(String.valueOf(datosProductos.espesor1));
			txtContenido.setText(String.valueOf(datosProductos.contenido1));
		} else if (producto == datosProductos.modelo2) {
			txtPrecio.setText(String.valueOf(datosProductos.precio2));
			txtAncho.setText(String.valueOf(datosProductos.ancho2));
			txtLargo.setText(String.valueOf(datosProductos.largo2));
			txtEspesor.setText(String.valueOf(datosProductos.espesor2));
			txtContenido.setText(String.valueOf(datosProductos.contenido2));
		}

		else if (producto == datosProductos.modelo3) {
			txtPrecio.setText(String.valueOf(datosProductos.precio3));
			txtAncho.setText(String.valueOf(datosProductos.ancho3));
			txtLargo.setText(String.valueOf(datosProductos.largo3));
			txtEspesor.setText(String.valueOf(datosProductos.espesor3));
			txtContenido.setText(String.valueOf(datosProductos.contenido3));
		}

		else if (producto == datosProductos.modelo4) {
			txtPrecio.setText(String.valueOf(datosProductos.precio4));
			txtAncho.setText(String.valueOf(datosProductos.ancho4));
			txtLargo.setText(String.valueOf(datosProductos.largo4));
			txtEspesor.setText(String.valueOf(datosProductos.espesor4));
			txtContenido.setText(String.valueOf(datosProductos.contenido4));
		}

		
	}

}
