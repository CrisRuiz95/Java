import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmAplicacion;
	private JTextField caja1;
	private JLabel label1;
	private JLabel label2;
	private JButton boton1;
	private String contenidoCaja1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmAplicacion.setVisible(true);
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
		frmAplicacion = new JFrame();
		frmAplicacion.setTitle("Aplicacion 1");
		frmAplicacion.setBounds(100, 100, 450, 300);
		frmAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplicacion.getContentPane().setLayout(null);
		
		label1 = new JLabel("Introduce tu nombre");
		label1.setBounds(56, 28, 117, 14);
		frmAplicacion.getContentPane().add(label1);
		
		caja1 = new JTextField();
		caja1.setBounds(56, 54, 237, 20);
		frmAplicacion.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		label2 = new JLabel("");
		label2.setBounds(56, 124, 237, 14);
		frmAplicacion.getContentPane().add(label2);
		
		boton1 = new JButton("Guardar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//escribimos
				contenidoCaja1 = caja1.getText().toString();
				
				if(contenidoCaja1.equals("")) {
					label2.setText("Error debes de introducir un valor");
				} else {
				label2.setText(contenidoCaja1);
				caja1.setText("");
				}
				
			}
		});
		boton1.setBounds(56, 85, 89, 23);
		frmAplicacion.getContentPane().add(boton1);
	}
}
