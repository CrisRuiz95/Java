import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JButton boton0;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonSuma;
	private JButton botonIgual;
	private JButton botonDivision;
	private JButton botonMultiplicacion;
	private JButton botonResta;
	private JButton botonPar;
	private JButton botonC;
	

	private String contenidoCaja1 = "";
	private float operando1=0.0f;
	private float operando2=0.0f; 
	private String operacion="";
	private float resultado= 0.0f;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
		boton6.setEnabled(estado);
		boton7.setEnabled(estado);
		boton8.setEnabled(estado);
		boton9.setEnabled(estado);
		botonPar.setEnabled(estado);
		botonResta.setEnabled(estado);
		botonMultiplicacion.setEnabled(estado);
		botonSuma.setEnabled(estado);
		botonDivision.setEnabled(estado);
		botonIgual.setEnabled(estado);
		}
	
	private void desbloquearBotones (boolean estado) {
		botonPar.setEnabled(true);
		botonResta.setEnabled(true);
		botonMultiplicacion.setEnabled(true);
		botonSuma.setEnabled(true);
		botonDivision.setEnabled(true);
		boton0.setEnabled(true);
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		boton3.setEnabled(true);
		boton4.setEnabled(true);
		boton5.setEnabled(true);
		boton6.setEnabled(true);
		boton7.setEnabled(true);
		boton8.setEnabled(true);
		boton9.setEnabled(true);
		botonIgual.setEnabled(true);
		
	}
	
	private void bloquearOperadores(boolean estado) {
		botonPar.setEnabled(estado);
		botonResta.setEnabled(estado);
		botonMultiplicacion.setEnabled(estado);
		botonSuma.setEnabled(estado);
		botonDivision.setEnabled(estado);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 423, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setEditable(false);
		caja1.setBounds(46, 41, 323, 43);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		botonC = new JButton("C");
		botonC.setFont(new Font("Arial", Font.BOLD, 15));
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals(String.valueOf(resultado))) {
					desbloquearBotones(true);
					caja1.setText("");
				}
				else {
					caja1.setText("");
					desbloquearBotones(true);
				}
			}
		});
		botonC.setBounds(46, 114, 72, 55);
		frame.getContentPane().add(botonC);
		
		botonPar = new JButton("PAR");
		botonPar.setFont(new Font("Arial", Font.BOLD, 15));
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					contenidoCaja1=caja1.getText();
					if (Float.parseFloat(contenidoCaja1) % 2 == 0){
						caja1.setText("Par");
					}else {
						caja1.setText("Impar");
					}
					bloquearOperadores(false);
					
				
				
				} catch (Exception e3) {
					bloquearBotones(false);
					caja1.setText("Error");
				}
			}
		});
		botonPar.setBounds(126, 114, 89, 55);
		frame.getContentPane().add(botonPar);
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("1");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "1";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton1.setFont(new Font("Arial", Font.BOLD, 15));
		boton1.setBounds(46, 180, 72, 55);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("2");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "2";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton2.setFont(new Font("Arial", Font.BOLD, 15));
		boton2.setBounds(126, 180, 72, 55);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("3");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "3";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton3.setFont(new Font("Arial", Font.BOLD, 15));
		boton3.setBounds(203, 180, 72, 55);
		frame.getContentPane().add(boton3);
		
		botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					contenidoCaja1 = caja1.getText();
					operando1 = Float.parseFloat(contenidoCaja1);
					operacion = "+";
					caja1.setText("");
					bloquearOperadores(false);
					
				
				} catch (Exception e3) {
					bloquearBotones(false);
					caja1.setText("Error");
				}
			}
		});
		botonSuma.setFont(new Font("Arial", Font.BOLD, 15));
		botonSuma.setBounds(285, 180, 72, 55);
		frame.getContentPane().add(botonSuma);
		
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("4");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "4";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton4.setFont(new Font("Arial", Font.BOLD, 15));
		boton4.setBounds(46, 246, 72, 55);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("5");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "5";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton5.setFont(new Font("Arial", Font.BOLD, 15));
		boton5.setBounds(126, 246, 72, 55);
		frame.getContentPane().add(boton5);
		
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("6");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "6";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton6.setFont(new Font("Arial", Font.BOLD, 15));
		boton6.setBounds(203, 246, 72, 55);
		frame.getContentPane().add(boton6);
		
		botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					contenidoCaja1 = caja1.getText();
					operando1 = Float.parseFloat(contenidoCaja1);
					operacion = "-";
					caja1.setText("");
					bloquearOperadores(false);
					
				
				
				} catch (Exception e3) {
					bloquearBotones(false);
					caja1.setText("Error");
				}
			}
		});
		botonResta.setFont(new Font("Arial", Font.BOLD, 15));
		botonResta.setBounds(285, 246, 72, 55);
		frame.getContentPane().add(botonResta);
		
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("7");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "7";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton7.setFont(new Font("Arial", Font.BOLD, 15));
		boton7.setBounds(46, 310, 72, 55);
		frame.getContentPane().add(boton7);
		
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("8");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "8";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton8.setFont(new Font("Arial", Font.BOLD, 15));
		boton8.setBounds(126, 310, 72, 55);
		frame.getContentPane().add(boton8);
		
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("9");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "9";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton9.setFont(new Font("Arial", Font.BOLD, 15));
		boton9.setBounds(203, 310, 72, 55);
		frame.getContentPane().add(boton9);
		
		botonMultiplicacion = new JButton("*");
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					contenidoCaja1 = caja1.getText();
					operando1 = Float.parseFloat(contenidoCaja1);
					operacion = "*";
					caja1.setText("");
					bloquearOperadores(false);
					
					
				
				} catch (Exception e3) {
					bloquearBotones(false);
					caja1.setText("Error");
				}
			}
		});
		botonMultiplicacion.setFont(new Font("Arial", Font.BOLD, 15));
		botonMultiplicacion.setBounds(285, 310, 72, 55);
		frame.getContentPane().add(botonMultiplicacion);
		
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText();
				if (contenidoCaja1.equals("")) {
					caja1.setText("0");
				}
				else {
					contenidoCaja1 = contenidoCaja1 + "0";
					caja1.setText(contenidoCaja1);
				}
			}
		});
		boton0.setFont(new Font("Arial", Font.BOLD, 15));
		boton0.setBounds(46, 376, 72, 55);
		frame.getContentPane().add(boton0);
		
		botonDivision = new JButton("/");
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					contenidoCaja1 = caja1.getText();
					operando1 = Float.parseFloat(contenidoCaja1);
					operacion = "/";
					caja1.setText("");
					bloquearOperadores(false);
					
				
				} catch (Exception e3) {
					bloquearBotones(false);
					caja1.setText("Error");
				}
			}
		});
		botonDivision.setFont(new Font("Arial", Font.BOLD, 15));
		botonDivision.setBounds(285, 376, 72, 55);
		frame.getContentPane().add(botonDivision);
		
		botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Arial", Font.BOLD, 15));
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				contenidoCaja1 = caja1.getText();
				if (contenidoCaja1.equalsIgnoreCase(caja1.getText())) {
					caja1.setText("Error");
					bloquearBotones(false);
				}
				else {	
				caja1.setText(contenidoCaja1 = caja1.getText());
				caja1.setText(String.valueOf(resultado));
				
				bloquearBotones(false);
			}
				
			operando2 = Float.parseFloat(contenidoCaja1);
			if(operacion.equals("+")) {
				
				resultado = operando1 + operando2;
				caja1.setText("" + resultado);
			}
			else if (operacion.equals("-")) {
				resultado = operando1 - operando2;
				caja1.setText("" + resultado);
			}
			else if (operacion.equals("*")) {
				resultado = operando1 * operando2;
				caja1.setText("" + resultado);
			}
			else if (operacion.equals("/")) {
				if (operando2 !=0) {
					resultado= operando1 / operando2;
					caja1.setText("" + resultado);
				}else {
					caja1.setText("Indeterminación");
				}
			}
			}

});
		botonIgual.setBounds(126, 376, 149, 55);
		frame.getContentPane().add(botonIgual);
	}
}
