package br.com.calculo.imc.modelo;

import java.util.Date;

public class Pessoa {
	private String nome;
	private double peso, altura;
	private Date dataCadastramento = new Date();
	
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
	
	public Date getDataCadastramento() {
		return dataCadastramento;
	}
	
	public void setDataCadastramento(Date dataCadastramento) {
		this.dataCadastramento = dataCadastramento;
	}

}
