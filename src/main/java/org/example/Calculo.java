package org.example;

public class Calculo {
	private float altura;
	private float peso;
	
	public Calculo(float altura, float peso) {
		setAltura(altura);
		setPeso(peso);
	}
	
	public Calculo() {
		
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float calculaIMC() {
		float result = this.getPeso() / (this.getAltura() * this.getAltura());
		if(result < 0) {
			return 0;
		}
		return result; 
	}
	
}
