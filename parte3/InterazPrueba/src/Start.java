import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Start {

	private JFrame frmConversor;
	private JTextField Caja1;
	private JLabel Label1;
	private JButton boton10;
	private JLabel Label2;
	
	private String contenidoCaja1= "";
	
	
	private float operando1=0.0f;
	private float operando2=0.0f; 
	private String operacion="";
	private float resultado = 0.0f;
	
	
	
	private JButton boton0;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton botonSuma;
	private JButton botonIgual;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void bloquearBotones(boolean estado) {
		boton0.setEnabled(estado);
		boton1.setEnabled(estado);
		boton2.setEnabled(estado);
		boton3.setEnabled(estado);
		boton4.setEnabled(estado);
		boton5.setEnabled(estado);
	}
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setTitle("Conversor 1.0");
		frmConversor.setBounds(100, 100, 389, 344);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		
		Label1 = new JLabel("Introduce un valor numérico: ");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(45, 24, 301, 14);
		frmConversor.getContentPane().add(Label1);
		
		Caja1 = new JTextField();
		Caja1.setEnabled(false);
		Caja1.setHorizontalAlignment(SwingConstants.CENTER);
		Caja1.setBounds(45, 51, 301, 20);
		frmConversor.getContentPane().add(Caja1);
		Caja1.setColumns(10);
		
		boton10 = new JButton("Convertir Euros a Dolares");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1 = Caja1.getText();
				
				if (contenidoCaja1.equalsIgnoreCase("")) {
					Caja1.setText("");
					Label2.setText("Error debe rellenar la caja de texto");
				}
				else {
					try {
						
					
					resultado = Float.parseFloat(contenidoCaja1) * 1.21f;
				Caja1.setText("");
				Caja1.setEnabled(false);
				boton10.setEnabled(false);
				Label2.setText("El resultado es: " +resultado);
				
				bloquearBotones(false);
				}
					catch(NumberFormatException e2) {
						Label2.setText("Ha introducido un valor no númerico");
					}
					}
				//System.out.println("El contenido de la caja es: " + contenidoCaja1);
			
				
			
				
			}
		});
		boton10.setBounds(45, 218, 301, 36);
		frmConversor.getContentPane().add(boton10);
		
		Label2 = new JLabel("New label");
		Label2.setFont(new Font("Sylfaen", Font.BOLD, 16));
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(45, 265, 301, 29);
		frmConversor.getContentPane().add(Label2);
		
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("0");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "0";
					Caja1.setText(contenidoCaja1);
				}
			}
		});
		boton0.setBounds(45, 83, 89, 23);
		frmConversor.getContentPane().add(boton0);
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("1");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "1";
					Caja1.setText(contenidoCaja1);
				}
				
			}
		});
		boton1.setBounds(147, 83, 89, 23);
		frmConversor.getContentPane().add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("2");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "2";
					Caja1.setText(contenidoCaja1);
				}
			}
		});
		boton2.setBounds(257, 83, 89, 23);
		frmConversor.getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("3");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "3";
					Caja1.setText(contenidoCaja1);
				}
			}
		});
		boton3.setBounds(45, 119, 89, 23);
		frmConversor.getContentPane().add(boton3);
		
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("4");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "4";
					Caja1.setText(contenidoCaja1);
				}
				
			}
		});
		boton4.setBounds(147, 119, 89, 23);
		frmConversor.getContentPane().add(boton4);
		
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= Caja1.getText();
				if (contenidoCaja1.equals("")) {
					Caja1.setText("5");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "5";
					Caja1.setText(contenidoCaja1);
				}
			}
		});
		boton5.setBounds(257, 119, 89, 23);
		frmConversor.getContentPane().add(boton5);
		
		botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				
				contenidoCaja1 = Caja1.getText();
				operando1 = Float.parseFloat(contenidoCaja1);
				operacion = "+";
				Caja1.setText("");
				botonSuma.setEnabled(false);
				
				
				System.out.println("Operación= " + operacion);
			} catch (Exception e3) {
				bloquearBotones(false);
				Caja1.setText("Error");
			}
				}
		});
		botonSuma.setBounds(45, 153, 301, 23);
		frmConversor.getContentPane().add(botonSuma);
		
		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				contenidoCaja1 = Caja1.getText();
				operando2 = Float.parseFloat(contenidoCaja1);
				System.out.println("Operando2= " + operando2);
				
				botonIgual.setEnabled(false);
				Caja1.setText("");
				bloquearBotones(false);
				} catch (Exception e3) {
					bloquearBotones(false);
					Caja1.setText("Error");
				}
				
				
				//REalizar las operaciones matemáticas
				if(operacion.equals("+")) {
					//Realizar la operación de suma
					resultado = operando1 + operando2;
					Caja1.setText(""+ resultado);
					Label2.setText(""+resultado);
				}


				
			}
		});
		botonIgual.setBounds(45, 187, 301, 23);
		frmConversor.getContentPane().add(botonIgual);
	}
}
