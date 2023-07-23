package org.example;

import org.example.Calculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ControleIMC implements ActionListener {
	private Tela controle;
	private Calculo imc;

	public ControleIMC() {
	}

	public ControleIMC(Tela controle) {
		this.controle = controle;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(controle.getTextFieldAltura().getText().isBlank() || controle.getTextFieldPeso().getText().isBlank()) {
			controle.getTextFieldAltura().setText("0");
			controle.getTextFieldPeso().setText("0");
			JOptionPane.showMessageDialog(null,"Insira os Campos, Por Favor");
		}
		
		String alturaString = controle.getTextFieldAltura().getText();
		String pesoString = controle.getTextFieldPeso().getText();
		float altura, peso;
		DecimalFormat df = new DecimalFormat("#.##");
		controle.getNivelImc();
		imc = new Calculo(altura = Float.parseFloat(alturaString), peso = Float.parseFloat(pesoString));
		if(imc.calculaIMC() <= 18.5 && imc.calculaIMC() > 0) {
			JOptionPane.showMessageDialog(null,"Seu IMC =  " + df.format(imc.calculaIMC()) + " | Abaixo do Normal");
		}else if(imc.calculaIMC() >= 18.6 && imc.calculaIMC() <= 24.9) {
			JOptionPane.showMessageDialog(null,"Seu IMC =  " + df.format(imc.calculaIMC()) + " | Normal");
		}else if(imc.calculaIMC() >= 25.0 && imc.calculaIMC() <= 29.9) {
			JOptionPane.showMessageDialog(null,"Seu IMC =  " + df.format(imc.calculaIMC()) + " | Sobrepeso");
		}else if(imc.calculaIMC() > 30){
			JOptionPane.showMessageDialog(null,"Seu IMC =  " + df.format(imc.calculaIMC()) + " | Obesidade");
		}
		controle.getTextFieldAltura().setText("");
		controle.getTextFieldPeso().setText("");
	}
}
