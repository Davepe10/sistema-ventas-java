package seccionMantenimiento;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;

import javax.swing.JButton;

public class Consultarceramico implements ActionListener {

	private JFrame frmConsultarCeramico;
	private static JTextField txtPrecio;
	private static JTextField txtAncho;
	private static JTextField txtLargo;
	private static JTextField txtEspesor;
	private static JTextField txtContenido;
	private static JLabel lblAncho;
	private JButton btnCerrar;
	private static JComboBox cboProductos;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultarceramico window = new Consultarceramico();
					window.frmConsultarCeramico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultarceramico() {
		initialize();
		mostrarInformacion();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultarCeramico = new JFrame();
		frmConsultarCeramico.setTitle("Consultar Ceramico");
		frmConsultarCeramico.setVisible(true);
		frmConsultarCeramico.setBounds(100, 100, 450, 300);
		frmConsultarCeramico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmConsultarCeramico.getContentPane().setLayout(null);
		frmConsultarCeramico.setLocationRelativeTo(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 22, 66, 14);
		frmConsultarCeramico.getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio(S/)");
		lblPrecio.setBounds(10, 56, 81, 14);
		frmConsultarCeramico.getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho(cm)");
		lblAncho.setBounds(10, 99, 89, 14);
		frmConsultarCeramico.getContentPane().add(lblAncho);
		
		JLabel lblLargo = new JLabel("Largo(cm)");
		lblLargo.setBounds(10, 136, 89, 14);
		frmConsultarCeramico.getContentPane().add(lblLargo);
		
		JLabel lblEspesor = new JLabel("Espesor(mm)");
		lblEspesor.setBounds(10, 174, 89, 14);
		frmConsultarCeramico.getContentPane().add(lblEspesor);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 215, 66, 14);
		frmConsultarCeramico.getContentPane().add(lblContenido);
		
		cboProductos = new JComboBox();
		cboProductos.addItem(datosProductos.modelo0);
		cboProductos.addItem(datosProductos.modelo1);
		cboProductos.addItem(datosProductos.modelo2);
		cboProductos.addItem(datosProductos.modelo3);
		cboProductos.addItem(datosProductos.modelo4);
		cboProductos.addActionListener(this);
		cboProductos.setBounds(109, 18, 196, 22);
		frmConsultarCeramico.getContentPane().add(cboProductos);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(109, 53, 196, 20);
		frmConsultarCeramico.getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(323, 18, 89, 23);
		frmConsultarCeramico.getContentPane().add(btnCerrar);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(109, 96, 196, 20);
		frmConsultarCeramico.getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setBounds(109, 133, 196, 20);
		frmConsultarCeramico.getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(109, 171, 196, 20);
		frmConsultarCeramico.getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setBounds(109, 212, 196, 20);
		frmConsultarCeramico.getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCerrar) {
			Cerrar();
		}
		
		if(e.getSource() == cboProductos) {
			mostrarInformacion();
		}
	}

	private void Cerrar() {
		// TODO Auto-generated method stub
		cboProductos.setSelectedIndex(0);
		frmConsultarCeramico.dispose();
	}
	
	
	public static void  mostrarInformacion() {
            String producto = cboProductos.getSelectedItem().toString();	
		
		
		if (producto == datosProductos.modelo0) {
			txtPrecio.setText(String.valueOf(datosProductos.precio0));
			txtAncho.setText(String.valueOf(datosProductos.ancho0));
			txtLargo.setText(String.valueOf(datosProductos.largo0));
			txtEspesor.setText(String.valueOf(datosProductos.espesor0));
			txtContenido.setText(String.valueOf(datosProductos.contenido0));
		}
		else if (producto == datosProductos.modelo1) {
			txtPrecio.setText(String.valueOf(datosProductos.precio1));
			txtAncho.setText(String.valueOf(datosProductos.ancho1));
			txtLargo.setText(String.valueOf(datosProductos.largo1));
			txtEspesor.setText(String.valueOf(datosProductos.espesor1));
			txtContenido.setText(String.valueOf(datosProductos.contenido1));
		}
		else if (producto == datosProductos.modelo2) {
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



