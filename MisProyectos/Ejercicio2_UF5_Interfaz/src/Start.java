import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JTextField caja2;
	private JLabel suma;
	private JLabel igual;
	private JLabel label2 ;
	private JLabel label1 ;
	private JButton boton1;
	
	private String contenidoCaja1;
	private String contenidoCaja2;
	
	private float num1 = 0.0f;
	private float num2= 0.0f;
	
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setBounds(45, 71, 86, 20);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(226, 71, 86, 20);
		frame.getContentPane().add(caja2);
		caja2.setColumns(10);
		
		suma = new JLabel("+");
		suma.setBounds(170, 74, 46, 14);
		frame.getContentPane().add(suma);
		
		igual = new JLabel("=");
		igual.setBounds(322, 74, 46, 14);
		frame.getContentPane().add(igual);
		
		label2 = new JLabel("");
		label2.setBounds(302, 111, 66, 37);
		frame.getContentPane().add(label2);
		
		label1 = new JLabel("calculadora");
		label1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		label1.setBounds(141, 26, 107, 28);
		frame.getContentPane().add(label1);
		
		boton1 = new JButton("Calcular");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1= caja1.getText().toString();
				contenidoCaja2=caja2.getText().toString();
				
				num1 = Float.parseFloat(contenidoCaja1);
				num2=Float.parseFloat(contenidoCaja2);
				
				resultado = num1+num2;
				
				label2.setText(""+resultado);
			}
		});
		boton1.setBounds(127, 126, 89, 23);
		frame.getContentPane().add(boton1);
	}

}
