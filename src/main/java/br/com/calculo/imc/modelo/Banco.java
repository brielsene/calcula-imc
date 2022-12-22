package br.com.calculo.imc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	
	
	private List<Pessoa>lista = new ArrayList<>();
	
	
	public void adicionaPessoa(Pessoa pessoa) {
		this.lista.add(pessoa);
	}
	
	public List<Pessoa> getLista() {
		return lista;
	}
}
