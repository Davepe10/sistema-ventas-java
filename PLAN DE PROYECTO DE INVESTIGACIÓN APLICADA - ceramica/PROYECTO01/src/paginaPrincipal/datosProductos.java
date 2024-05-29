package paginaPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class datosProductos {

	private JFrame frame;

	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;

	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;

	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;

	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;

	// Datos mínimos del quinto producto

	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;

	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;

	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;

	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;

	// Cuota diaria
	public static double cuotaDiaria = 30000;

	// para calcular la suma de importes

	public static double importeAcumulado = 0.0;

	// contador de avisos
	public static int contarAviso = 0;

	// incrementos por producto seleccionado

	public static double incrementoTotal0 = 0;
	public static double incrementoTotal1 = 0;
	public static double incrementoTotal2 = 0;
	public static double incrementoTotal3 = 0;
	public static double incrementoTotal4 = 0;

	// incremento de cantidad vendidas

	public static int cantidadVendida0 = 0;
	public static int cantidadVendida1 = 0;
	public static int cantidadVendida2 = 0;
	public static int cantidadVendida3 = 0;
	public static int cantidadVendida4 = 0;

	// contador de cajas vendidas

	public static int contadorCantidad0 = 0;
	public static int contadorCantidad1 = 0;
	public static int contadorCantidad2 = 0;
	public static int contadorCantidad3 = 0;
	public static int contadorCantidad4 = 0;

	
	
	//precio promedio 
	
	public static double precioPromedio = 57.73;
	
	
	/**
	 * 
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datosProductos window = new datosProductos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public datosProductos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
