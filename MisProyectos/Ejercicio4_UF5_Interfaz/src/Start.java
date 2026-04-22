import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JButton boton1;
	private JButton suma;
	private JButton boton2;
	private JButton igual;
	
	private String contenidoCaja1="";
	private String numero1= "";
	private String numero2= "";
	private String operacion = "";
	
	private float n1=0.0f;
	private float n2= 0.0f;
	private float resultado = 0.0f;
	private JButton reset;
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
		frame.setBounds(100, 100, 450, 232);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setBounds(118, 28, 212, 20);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + 1 ;
				caja1.setText(contenidoCaja1);
				
			}
		});
		boton1.setBounds(70, 69, 89, 23);
		frame.getContentPane().add(boton1);
		
		suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					numero1 = caja1.getText().toString();
					caja1.setText("");
					suma.setEnabled(false);
					operacion = "+";
			}
		});
		suma.setBounds(298, 69, 89, 23);
		frame.getContentPane().add(suma);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + 2 ;
				caja1.setText(contenidoCaja1);
			}
		});
		boton2.setBounds(185, 69, 89, 23);
		frame.getContentPane().add(boton2);
		
		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = caja1.getText().toString();
				caja1.setText("");
				if( operacion.equals("+")) {
					n1 = Float.parseFloat(numero1);
					n2= Float.parseFloat(numero2);
					resultado = n1+n2;
					caja1.setText(""+resultado);
					suma.setEnabled(true);
				}
			
			}
		});
		igual.setBounds(185, 113, 89, 23);
		frame.getContentPane().add(igual);
		
		reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numero1 = "";
				numero2 = "";
				suma.setEnabled(true);
				igual.setEnabled(true);
				operacion ="";
				caja1.setText("");
			}
		});
		reset.setBounds(335, 159, 89, 23);
		frame.getContentPane().add(reset);
	}
}
