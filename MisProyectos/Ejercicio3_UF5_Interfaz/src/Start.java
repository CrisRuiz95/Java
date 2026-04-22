import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	
	private String contenidoCaja1="";
	private JLabel label1;
	private JLabel label2;
	
	private int contadorA=0;
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
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setBounds(67, 25, 287, 20);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		boton1 = new JButton("A");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + "A";
				caja1.setText(contenidoCaja1);
				contadorA = contadorA + 1;
				label2.setText(""+contadorA);
					if (contadorA ==5) {
						boton1.setEnabled(false);					}
				
			}
		});
		boton1.setBounds(67, 73, 89, 23);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("B");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + "B";
				caja1.setText(contenidoCaja1);
			}
		});
		boton2.setBounds(166, 73, 89, 23);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("C");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + "C";
				caja1.setText(contenidoCaja1);
			}
		});
		boton3.setBounds(265, 73, 89, 23);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("E");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1 = caja1.getText().toString();
				contenidoCaja1 = contenidoCaja1 + "E";
				caja1.setText(contenidoCaja1);
				
			}
		});
		boton4.setBounds(166, 120, 89, 23);
		frame.getContentPane().add(boton4);
		
		label1 = new JLabel("Numero de Aes: ");
		label1.setBounds(52, 190, 89, 14);
		frame.getContentPane().add(label1);
		
		label2 = new JLabel("");
		label2.setBounds(151, 190, 89, 14);
		frame.getContentPane().add(label2);
	}

}
