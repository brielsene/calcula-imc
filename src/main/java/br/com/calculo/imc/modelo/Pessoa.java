package br.com.calculo.imc.modelo;

public class Pessoa {
	private String nome;
	private double peso, altura;
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}

}
