package org.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tela {

	private JFrame frmCalculadoraImc;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JButton btnCalcular;
	private JOptionPane nivelImc;
	
	public JOptionPane getNivelImc() {
		return nivelImc;
	}

	public void setNivelImc(JOptionPane nivelImc) {
		this.nivelImc = nivelImc;
	}

	public JTextField getTextFieldPeso() {
		return textFieldPeso;
	}

	public void setTextFieldPeso(JTextField textFieldPeso) {
		this.textFieldPeso = textFieldPeso;
	}

	public JTextField getTextFieldAltura() {
		return textFieldAltura;
	}

	public void setTextFieldAltura(JTextField textFieldAltura) {
		this.textFieldAltura = textFieldAltura;
	}

	public JButton getBtnCalcular() {
		return btnCalcular;
	}

	public void setBtnCalcular(JButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmCalculadoraImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
		textFieldAltura.setDocument(new SoNumeros());
		textFieldPeso.setDocument(new SoNumeros());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraImc = new JFrame();
		frmCalculadoraImc.setTitle("Calculadora IMC");
		frmCalculadoraImc.setResizable(false);
		frmCalculadoraImc.setBounds(100, 100, 300, 350);
		frmCalculadoraImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraImc.getContentPane().setLayout(null);
		frmCalculadoraImc.setLocationRelativeTo(null);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(97, 213, 89, 30);
		frmCalculadoraImc.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ControleIMC(this));
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(50, 63, 181, 30);
		frmCalculadoraImc.getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setColumns(10);
		textFieldAltura.setBounds(50, 133, 181, 30);
		frmCalculadoraImc.getContentPane().add(textFieldAltura);
		
		JLabel lblPeso = new JLabel("Informe seu Peso (kg)");
		lblPeso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPeso.setBounds(50, 49, 155, 14);
		frmCalculadoraImc.getContentPane().add(lblPeso);
		
		JLabel lblAltura = new JLabel("Informe sua Altura (m)");
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAltura.setBounds(50, 117, 155, 14);
		frmCalculadoraImc.getContentPane().add(lblAltura);
		
		nivelImc = new JOptionPane(); 
		
	}
}
