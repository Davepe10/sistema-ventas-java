package seccionVentas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import paginaPrincipal.datosProductos;
import seccionMantenimiento.Consultarceramico;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Vender implements ActionListener {

	private JFrame frmVender;
	private JTextField txtPrecio;
	private static JTextField txtCantidad;
	private static JComboBox cboProducto;
	private JButton btnVender;
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
					Vender window = new Vender();
					window.frmVender.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vender() {
		initialize();
		mostrarPrecio();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVender = new JFrame();
		frmVender.setTitle("Vender");
		frmVender.setBounds(100, 100, 481, 444);
		frmVender.setVisible(true);
		frmVender.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVender.getContentPane().setLayout(null);
		frmVender.setLocationRelativeTo(null);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(24, 47, 75, 14);
		frmVender.getContentPane().add(lblModelo);

		JLabel lblPrecio = new JLabel("Precio(S/)");
		lblPrecio.setBounds(24, 83, 75, 14);
		frmVender.getContentPane().add(lblPrecio);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(24, 120, 75, 14);
		frmVender.getContentPane().add(lblCantidad);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(120, 80, 140, 20);
		frmVender.getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(120, 117, 140, 20);
		frmVender.getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		cboProducto = new JComboBox();
		cboProducto.addItem(datosProductos.modelo0);
		cboProducto.addItem(datosProductos.modelo1);
		cboProducto.addItem(datosProductos.modelo2);
		cboProducto.addItem(datosProductos.modelo3);
		cboProducto.addItem(datosProductos.modelo4);
		cboProducto.addActionListener(this);
		cboProducto.setBounds(117, 43, 143, 22);
		frmVender.getContentPane().add(cboProducto);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(351, 43, 89, 23);
		frmVender.getContentPane().add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(351, 79, 89, 23);
		frmVender.getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 181, 416, 213);
		frmVender.getContentPane().add(scrollPane);

		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		scrollPane.setViewportView(txtResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCerrar) {

			cerrar();
		}

		if (e.getSource() == btnVender) {
			mostrarInformacion();
			notificarAviso();
			cantidadVentasModelo();
		}

		if (e.getSource() == cboProducto) {
			mostrarPrecio();

		}

	}

	private void cerrar() {
		// TODO Auto-generated method stub
		frmVender.dispose();
		cboProducto.setSelectedIndex(0);
	}

	
	
	//Declaracion de  metodos para  la  venta 
	
	
	public static String leerProducto() {
		return cboProducto.getSelectedItem().toString();
	}

	private static int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}


	private void mostrarPrecio() {

		String producto1 = leerProducto();

		if (producto1 == datosProductos.modelo0) {
			txtPrecio.setText(String.valueOf(datosProductos.precio0));
		} else if (producto1 == datosProductos.modelo1) {
			txtPrecio.setText(String.valueOf(datosProductos.precio1));
		} else if (producto1 == datosProductos.modelo2) {
			txtPrecio.setText(String.valueOf(datosProductos.precio2));
		} else if (producto1 == datosProductos.modelo3) {
			txtPrecio.setText(String.valueOf(datosProductos.precio3));
		} else if (producto1 == datosProductos.modelo4) {
			txtPrecio.setText(String.valueOf(datosProductos.precio4));	
		}
	}

	public static double preciounitario() {

		double precio = 0;
		String producto = leerProducto();

		if (producto == datosProductos.modelo0) {
			precio = ((datosProductos.precio0));
		} else if (producto == datosProductos.modelo1) {
			precio = ((datosProductos.precio1));
		} else if (producto == datosProductos.modelo2) {
			precio = datosProductos.precio2;
		} else if (producto == datosProductos.modelo3) {
			precio = datosProductos.precio3;
		} else if (producto == datosProductos.modelo4) {
			precio = datosProductos.precio4; 
			}
		return precio;
	}

	
	private double importeCompra() {
		return leerCantidad() * preciounitario();
	}
	
	
	private double importeDecuento(int cantidad) {

		double descuento = 0;

		if (cantidad >= 1 && cantidad <= 5) {
			descuento = (datosProductos.porcentaje1 / 100);
		} else if (cantidad >= 6 && cantidad <= 10) {
			descuento = (datosProductos.porcentaje2 / 100);
		} else if (cantidad >= 11 && cantidad <= 15) {
			descuento = (datosProductos.porcentaje3 / 100);
		} else if (cantidad > 15) {
			descuento = (datosProductos.porcentaje4 / 100);
		} return descuento;
	}

	private int otorgarObsequio(int cantidad) {

		int obsequio = 0;

		if (cantidad >= 1 && cantidad <= 5) {
			obsequio = datosProductos.obsequioCantidad1 * cantidad;
		} else if (cantidad >= 6 && cantidad <= 10) {
			obsequio = datosProductos.obsequioCantidad2 * cantidad;
		} else if (cantidad > 10) {
			obsequio = datosProductos.obsequioCantidad3 * cantidad;
		}
		return obsequio;
	}

	private double imporPagar() {
		return (importeCompra() - ( importeDecuento(leerCantidad()) * importeCompra()));
		 
	}
	
	private double importeAcumuladoTotal() {
		return datosProductos.importeAcumulado += imporPagar();
	}

	private void mostrarInformacion() {

		DecimalFormat formato1 = new DecimalFormat("#.00"); // Sirve para dar  formato a los  numeros //
		
		String modelo = leerProducto();
		double precio = preciounitario();
		int cantidadCajas = leerCantidad();
		double imporCompra = importeCompra();
		double imporDescuento = ((importeDecuento(cantidadCajas) * imporCompra));
		double imporPagar = imporCompra - imporDescuento;
		int regalo = otorgarObsequio(cantidadCajas);
		String tipoObsequio = "Lapicero";

		
		
		txtResultado.setText("BOLETA DE VENTA" + "\n" + "\n" + "\n");
		txtResultado.append("Modelo del cerámico: " + modelo + "\n" + "\n");
		txtResultado.append("Precio unitario : S/ " + precio + "\n" + "\n");
		txtResultado.append("Cantidad de cajas adquiridas : " + cantidadCajas + "\n" + "\n");
		txtResultado.append("Importe compra : S/ " + formato1.format(imporCompra) + "\n" + "\n");
		txtResultado.append("Importe de descuento: S/ " + formato1.format(imporDescuento) + "\n" + "\n");
		txtResultado.append("Importe a pagar: S/ " + formato1.format(imporPagar) + "\n" + "\n");
		txtResultado.append("Tipo de obsequio : " + tipoObsequio + "\n" + "\n");
		txtResultado.append("Unidades Obsequidas : " + regalo + "\n" + "\n");

		datosProductos.contarAviso++;
	}

	private double porcentajeCoutaDiaria() {
		return (100 * (datosProductos.importeAcumulado / datosProductos.cuotaDiaria));
	}

	private void notificarAviso() {

		DecimalFormat formato2 = new DecimalFormat("#0.00"); // para determinar cuantos decimales mostrar
		double nota = importeAcumuladoTotal();
		double porcentaje = (porcentajeCoutaDiaria());

		if (datosProductos.contarAviso % 5 == 0) {
			JOptionPane.showMessageDialog(null,
					"Venta Nro." + datosProductos.contarAviso + "\n" + "Importe total general acumulado: S/ "
							+ String.valueOf(formato2.format(nota)) + "\n" + "Porcentaje de cuota diaria: "
							+ String.valueOf(formato2.format(porcentaje)) + "%",
					"Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	// segunda parte para los reportes

	public static void cantidadVentasModelo() {

		String producto = leerProducto();

		if (producto == datosProductos.modelo0) {
			datosProductos.contadorCantidad0 += leerCantidad();
			datosProductos.cantidadVendida0++;
		} else if (producto == datosProductos.modelo1) {
			datosProductos.cantidadVendida1++;
			datosProductos.contadorCantidad1 += leerCantidad();
		} else if (producto == datosProductos.modelo2) {
			datosProductos.cantidadVendida2++;
			datosProductos.contadorCantidad2 += leerCantidad();
		} else if (producto == datosProductos.modelo3) {
			datosProductos.cantidadVendida3++;
			datosProductos.contadorCantidad3 += leerCantidad();
		} else if (producto == datosProductos.modelo4) {
			datosProductos.cantidadVendida4++;
			datosProductos.contadorCantidad4 += leerCantidad();

		}
		
		
		
		
		

		String mensaje =
				 "Cantidad de ventas: " + datosProductos.cantidadVendida0 + "\n"
				 + "Cantidad de ventas: " + datosProductos.cantidadVendida1 + "\n"
				 + "Cantidad de ventas: "+ datosProductos.cantidadVendida2 + "\n"
				 + "Cantidad de ventas: " + datosProductos.cantidadVendida3 + "\n"
				 + "Cantidad de ventas: " + datosProductos.cantidadVendida4 + "\n" + "\n" +

				"Cantidad de ventas1: " + datosProductos.contadorCantidad0 + "\n" + "Cantidad de ventas1: "
						+ datosProductos.contadorCantidad1 + "\n" + "Cantidad de ventas1: "
						+ datosProductos.contadorCantidad2 + "\n" + "Cantidad de ventas1: "
						+ datosProductos.contadorCantidad3 + "\n" + "Cantidad de ventas1: "
						+ datosProductos.contadorCantidad4 + "\n"+  "\n" +

		
		"Cantidad de ssdf: " + (preciounitario() * datosProductos.contadorCantidad0) + "\n" + "Cantidad de de cajas: "
		+ (preciounitario() * datosProductos.contadorCantidad1)+ "\n" + "Cantidad de dasfasdf: "
		+(preciounitario() * datosProductos.contadorCantidad2) + "\n" + "Cantidad de saffsd: "
		+(preciounitario()* datosProductos.contadorCantidad3)+ "\n" + "Cantidad de safd: "
		+ (preciounitario()* datosProductos.contadorCantidad4) + "\n";
		

		txtResultado.append(String.valueOf(mensaje));

		// return mensaje;
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

	public static void formarModeloCadena() {

		
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

	public static void formarCadenaCajasComparacion() {

		
		comparacionCajas(datosProductos.modelo0,datosProductos.precio0, datosProductos.precioPromedio);

		comparacionCajas(datosProductos.modelo1,datosProductos.precio1, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo2,datosProductos.precio2, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo3,datosProductos.precio3, datosProductos.precioPromedio);
		comparacionCajas(datosProductos.modelo4,datosProductos.precio4, datosProductos.precioPromedio);
	}

	
	
}
	