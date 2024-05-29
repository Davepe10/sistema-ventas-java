package seccionVentas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

import paginaPrincipal.datosProductos;
import javax.swing.JScrollPane;

public class generarReporte implements ActionListener {

	private JFrame frmGenerarReportes;
	private JComboBox cboProducto;
	private JButton btnCerrar;
	private static JTextArea txtResultado;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generarReporte window = new generarReporte();
					window.frmGenerarReportes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public generarReporte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGenerarReportes = new JFrame();
		frmGenerarReportes.setTitle("Generar reportes");
		frmGenerarReportes.setBounds(100, 100, 585, 350);
		frmGenerarReportes.setVisible(true);
		frmGenerarReportes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmGenerarReportes.getContentPane().setLayout(null);
		frmGenerarReportes.setLocationRelativeTo(null);

		JLabel lblTiporeporte = new JLabel("Tipo de reporte");
		lblTiporeporte.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTiporeporte.setBounds(10, 21, 107, 14);
		frmGenerarReportes.getContentPane().add(lblTiporeporte);

		cboProducto = new JComboBox();
		cboProducto.setBounds(141, 18, 275, 22);
		cboProducto.addItem("Ventas por modelo");
		cboProducto.addItem("Comparacion de precios con el precio promedio");
		cboProducto.addItem("Comparacion de cajas vendidas  con la cantidad optima");
		cboProducto.addItem("Estadistica sobre el precio");
		cboProducto.addActionListener(this);
		frmGenerarReportes.getContentPane().add(cboProducto);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(470, 18, 89, 23);
		frmGenerarReportes.getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 54, 536, 246);
		frmGenerarReportes.getContentPane().add(scrollPane);

		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		txtResultado.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCerrar) {
			cerrar();
		}

		if (e.getSource() == cboProducto) {
			mostrarReporte();
			formarModeloCadena();

		}
	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmGenerarReportes.dispose();
	}

	private void comparacionPrecios() {

	}

	private String leerSeccion() {
		return cboProducto.getSelectedItem().toString();
	}

	private void mostrarReporte() {

		String item = leerSeccion();

		switch (item) {

		case "Ventas por modelo":

			formarModeloCadena();
			break;

		case "Comparacion de precios con el precio promedio":
			formarCadenaCajasComparacion();
 
			break;

		case "Comparacion de cajas vendidas  con la cantidad optima":

			break;

		case "Estadistica sobre el precio":

			break;
		}
	}

	private static void ventasPorModelo(String cadena1, double cadena2, double cadena3, double cadena4,
			double cadena5) {
		// TODO Auto-generated method stub
	
		txtResultado.append("  Modelo                                             :   " + "  " + cadena1 + "\n");
		txtResultado.append("  Cantidad de ventas                       :   " + "  " +"S/."+ cadena2 + "\n");
		txtResultado.append("  Cantidad de cajas vendidas       :   " + "  " + "S/."+ cadena3 + "\n");
		txtResultado.append("  Importe total vendido                    :   " + "  "+ "S/." + cadena4 + "\n");
		txtResultado.append("  Aporte a la cuota diaria                :   " + "       " + cadena4 +"%" + "\n" + "\n");

	}

	private void formarModeloCadena() {

		
		ventasPorModelo(datosProductos.modelo0, datosProductos.cantidadVendida0, datosProductos.contadorCantidad0,
				(datosProductos.precio0 * datosProductos.contadorCantidad0),
				(((datosProductos.precio0 * datosProductos.contadorCantidad0) / datosProductos.cuotaDiaria) * 100));

		ventasPorModelo(datosProductos.modelo1, datosProductos.cantidadVendida1, datosProductos.contadorCantidad1,
				(datosProductos.precio1 * datosProductos.contadorCantidad1),
				(((datosProductos.precio1 * datosProductos.contadorCantidad1) / datosProductos.cuotaDiaria) * 100));
		ventasPorModelo(datosProductos.modelo2, datosProductos.cantidadVendida2, datosProductos.contadorCantidad2,
				(datosProductos.precio2 * datosProductos.contadorCantidad2),
				(((datosProductos.precio2 * datosProductos.contadorCantidad2) / datosProductos.cuotaDiaria) * 100));
		ventasPorModelo(datosProductos.modelo3, datosProductos.cantidadVendida3, datosProductos.contadorCantidad3,
				(datosProductos.precio3 * datosProductos.contadorCantidad3),
				(((datosProductos.precio3 * datosProductos.contadorCantidad3) / datosProductos.cuotaDiaria) * 100));
		ventasPorModelo(datosProductos.modelo4, datosProductos.cantidadVendida4, datosProductos.contadorCantidad4,
				(datosProductos.precio4 * datosProductos.contadorCantidad4),
				(((datosProductos.precio4 * datosProductos.contadorCantidad4) / datosProductos.cuotaDiaria) * 100));

	}

	private static void comparacionCajas(String cadena1, double cadena2, double cadena3) {
		// TODO Auto-generated method stub
	
		txtResultado.append("  Modelo                                             :   " + "  " + cadena1 + "\n");
		txtResultado.append("  Precio                       :   " + "  " + cadena2 + "\n");
		txtResultado.append("  Precio Promedio       :   " + "  " +  cadena3 + "\n");
	//	txtResultado.append("  Comparacion                    :   " + "  "+ "S/." + cadena4 + "\n");
	//	txtResultado.append("  Aporte a la cuota diaria                :   " + "       " + cadena4 +"%" + "\n" + "\n");

	}

	private void formarCadenaCajasComparacion() {

		
		comparacionCajas(datosProductos.modelo0,datosProductos.precio0, datosProductos.precioPromedio);

		comparacionCajas(datosProductos.modelo1,datosProductos.precio1, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo2,datosProductos.precio2, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo3,datosProductos.precio3, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo4,datosProductos.precio4, datosProductos.precioPromedio);
	}

	
	
	/*private  double comparacionPrecio() {
		
		double precio = Vender.preciounitario();
		double comparacion = 0;
		String mensaje = "";
		
		if(precio > datosProductos.precioPromedio) {
			comparacion = precio - datosProductos.precioPromedio;
			//*if(comparacion) {
				 mensaje = comparacion + " mas que el promedio";
			}
		}
		
	}
	/*
	  Modelo : Cinza Plus
Precio : 92.56
Precio promedio : 57.73
Comparación : 34.83 más que el promedio

	Modelo : Cinza Plus
	Cantidad de cajas vendidas : 10
	Cantidad óptima : 10
	Comparación : igual que la cantidad óptima
	
	*/
	
	
	
	
}
