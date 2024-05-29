package paginaPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import seccionAyuda.acercadeTienda;
import seccionConfiguracion.configurarCantidad;
import seccionConfiguracion.configurarCuota;
import seccionConfiguracion.configurarDescuento;
import seccionConfiguracion.configurarObsequio;
import seccionMantenimiento.Consultarceramico;
import seccionMantenimiento.Listarceramico;
import seccionMantenimiento.Modificarceramico;
import seccionVentas.Vender;
import seccionVentas.generarReporte;

import javax.swing.JButton;

public class menuprincipal implements ActionListener {

	private JFrame frmTienda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenuItem mntmVender;
	private JMenuItem mntmReportes;
	private JMenuItem mntmCdescuento;
	private JMenuItem mntmCobsequio;
	private JMenuItem mntmCcantidadOptima;
	private JMenuItem mntmCcuota;
	private JMenuItem mntmAcerca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuprincipal window = new menuprincipal();
					window.frmTienda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menuprincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTienda = new JFrame();
		frmTienda.setTitle("Tienda 1.0");
		frmTienda.setBounds(200, 200, 900, 600);
		frmTienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTienda.getContentPane().setLayout(null);
		frmTienda.setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		frmTienda.setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);

		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);

		mntmConsultar = new JMenuItem("Consultar cer\u00E1mico");
		mntmConsultar.addActionListener(this);
		mnMantenimiento.add(mntmConsultar);

		mntmModificar = new JMenuItem("Modificar cer\u00E1mico");
		mntmModificar.addActionListener(this);
		mnMantenimiento.add(mntmModificar);

		mntmListar = new JMenuItem("Listar cer\u00E1micos");
		mntmListar.addActionListener(this);
		mnMantenimiento.add(mntmListar);

		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		mntmReportes = new JMenuItem("Generar reportes");
		mntmReportes.addActionListener(this);
		mnVentas.add(mntmReportes);

		JMenu mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);

		mntmCdescuento = new JMenuItem("Configurar descuentos");
		mntmCdescuento.addActionListener(this);
		mnConfiguracion.add(mntmCdescuento);

		mntmCobsequio = new JMenuItem("Configurar obsequios");
		mntmCobsequio.addActionListener(this);
		mnConfiguracion.add(mntmCobsequio);

		mntmCcantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmCcantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmCcantidadOptima);

		mntmCcuota = new JMenuItem("Configurar cuota diaria");
		mntmCcuota.addActionListener(this);
		mnConfiguracion.add(mntmCcuota);

		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		frmTienda.getContentPane().setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == mntmSalir) {
			Salir();
		}

		if (e.getSource() == mntmConsultar) {
			consultarCeramico();

		}

		if (e.getSource() == mntmModificar) {
			modificarCeramico();

		}

		if (e.getSource() == mntmListar) {
			listarCeramico();

		}

		if (e.getSource() == mntmVender) {
			venderCeramico();
		}

		if (e.getSource() == mntmReportes) {
			reporteCeramica();

		}

		if (e.getSource() == mntmCdescuento) {
			confiDescuento();
		}

		if (e.getSource() == mntmCobsequio) {
			confiObsequio();

		}
		if (e.getSource() == mntmCcantidadOptima) {
			confiCantidadOptima();
		}

		if (e.getSource() == mntmCcuota) {
			confiCouta();

		}
		if (e.getSource() == mntmAcerca) {
			acercaTienda();

		}

	}

	private void acercaTienda() {
		// TODO Auto-generated method stub
		acercadeTienda acercaTienda = new acercadeTienda();
	}

	private void confiCouta() {
		// TODO Auto-generated method stub
		configurarCuota confiCuota = new configurarCuota();
	}

	private void confiCantidadOptima() {
		// TODO Auto-generated method stub
		configurarCantidad cantidadOptima = new configurarCantidad();
	}

	private void confiObsequio() {
		// TODO Auto-generated method stub
		configurarObsequio confiObsequio = new configurarObsequio();
	}

	private void confiDescuento() {
		// TODO Auto-generated method stub
		configurarDescuento cDescuento = new configurarDescuento();
	}

	private void reporteCeramica() {
		// TODO Auto-generated method stub
		generarReporte generarReporte = new generarReporte();
	}

	private void venderCeramico() {
		// TODO Auto-generated method stub
		Vender venderCeramico = new Vender();
	}

	private void listarCeramico() {
		// TODO Auto-generated method stub
		Listarceramico listarCeramico = new Listarceramico();
	}

	private void modificarCeramico() {
		// TODO Auto-generated method stub
		Modificarceramico modificarCeramico = new Modificarceramico();

	}

	private void consultarCeramico() {
		// TODO Auto-generated method stub

		Consultarceramico consultarCeramico = new Consultarceramico();

	}

	private void Salir() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
