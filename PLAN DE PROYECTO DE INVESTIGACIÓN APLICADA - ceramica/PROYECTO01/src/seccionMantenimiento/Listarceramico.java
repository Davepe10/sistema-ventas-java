package seccionMantenimiento;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import paginaPrincipal.datosProductos;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Listarceramico implements ActionListener {

	private JFrame frmListadoDeCeramicos;
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listarceramico window = new Listarceramico();
					window.frmListadoDeCeramicos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Listarceramico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListadoDeCeramicos = new JFrame();
		frmListadoDeCeramicos.setTitle("Listado de Ceramicos");
		frmListadoDeCeramicos.setVisible(true);
		frmListadoDeCeramicos.setBounds(150, 100, 450, 500);
		frmListadoDeCeramicos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmListadoDeCeramicos.setLocationRelativeTo(null);
		frmListadoDeCeramicos.getContentPane().setLayout(null);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(108, 427, 89, 23);
		btnCerrar.addActionListener(this);
		frmListadoDeCeramicos.getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(236, 427, 89, 23);
		frmListadoDeCeramicos.getContentPane().add(btnListar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 404);
		frmListadoDeCeramicos.getContentPane().add(scrollPane);

		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		scrollPane.setViewportView(txtResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnListar) {
			listarProductos();

		}
		if (e.getSource() == btnCerrar) {
			cerrar();

		}
	}

	private void listarProductos() {
		// TODO Auto-generated method stub
		mostrarLista(datosProductos.modelo0, datosProductos.precio0, datosProductos.ancho0, datosProductos.largo0,
				datosProductos.espesor0, datosProductos.contenido0);

		mostrarLista(datosProductos.modelo1, datosProductos.precio1, datosProductos.ancho1, datosProductos.largo1,
				datosProductos.espesor1, datosProductos.contenido1);

		mostrarLista(datosProductos.modelo2, datosProductos.precio2, datosProductos.ancho2, datosProductos.largo2,
				datosProductos.espesor2, datosProductos.contenido2);

		mostrarLista(datosProductos.modelo3, datosProductos.precio3, datosProductos.ancho3, datosProductos.largo3,
				datosProductos.espesor3, datosProductos.contenido3);

		mostrarLista(datosProductos.modelo4, datosProductos.precio4, datosProductos.ancho4, datosProductos.largo4,
				datosProductos.espesor4, datosProductos.contenido4);
	}

	private void mostrarLista(String cadena1, double cadena2, double cadena3, double cadena4, double cadena5,
			int cadena6) {
		// TODO Auto-generated method stub

		txtResultado.append("\n" + " LISTADO DE CERAMICOS" + "\n" + "\n");

		txtResultado.append("  Modelo                   :   " + "  " + cadena1 + "\n");
		txtResultado.append("  Precio                     :   " + "  " + cadena2 + "\n");
		txtResultado.append("  Ancho (cm)            :   " + "  " + cadena3 + "\n");
		txtResultado.append("  Largo (mm)           :   " + "  " + cadena4 + "\n");
		txtResultado.append("  Espesor (mm)      :   " + "  " + cadena5 + "\n");
		txtResultado.append("  Contenido              :   " + "  " + cadena6 + "\n");
	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmListadoDeCeramicos.dispose();
	}
}
