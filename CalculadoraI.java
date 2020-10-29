import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraI {

	private JFrame frame;
	private JTextField textA;
	private JTextField textB;
	private JTextField resultado;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraI window = new CalculadoraI();
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
	public CalculadoraI() {
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
		
		textA = new JTextField();
		textA.setBounds(35, 44, 79, 26);
		frame.getContentPane().add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setBounds(126, 44, 65, 26);
		frame.getContentPane().add(textB);
		textB.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(35, 91, 156, 26);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calculadora obj = new Calculadora(Integer.valueOf(textA.getText()),Integer.valueOf(textB.getText()));
				resultado.setText(String.valueOf(obj.Sumar()));
			}
		});
		btnNewButton.setBounds(220, 44, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("*");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora obj = new Calculadora(Integer.valueOf(textA.getText()),Integer.valueOf(textB.getText()));
				resultado.setText(String.valueOf(obj.Multiplicar()));
				
			}
		});
		btnNewButton_1.setBounds(220, 85, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
	}
}
