package br.com.danilomarcus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
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
		
		JLabel lblCalculadora = new JLabel("CALCULADORA");
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblCalculadora.setBounds(51, 0, 358, 74);
		frame.getContentPane().add(lblCalculadora);
		
		JLabel lblNewLabel = new JLabel("Valor1");
		lblNewLabel.setBounds(82, 85, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor2");
		lblNewLabel_1.setBounds(82, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 85, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 121, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 + val2;
				JOptionPane.showMessageDialog(null, "A soma é: " + total);
			
			}
		});
		btnSomar.setBounds(51, 180, 91, 23);
		frame.getContentPane().add(btnSomar);
		
		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 - val2;
				JOptionPane.showMessageDialog(null, "A subtração é: " + total);
				
			}
		});
		btnSubtrair.setBounds(154, 180, 91, 23);
		frame.getContentPane().add(btnSubtrair);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 * val2;
				JOptionPane.showMessageDialog(null, "A multiplicação é: " + total);
			}
		});
		btnMultiplicar.setBounds(51, 213, 91, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				
				double val1 = Double.parseDouble(valor1);
				double val2 = Double.parseDouble(valor2);
				double total = val1 / val2;
				JOptionPane.showMessageDialog(null, "A divisão é: " + total);
			}
		});
		btnDividir.setBounds(154, 213, 91, 23);
		frame.getContentPane().add(btnDividir);
	}
}
