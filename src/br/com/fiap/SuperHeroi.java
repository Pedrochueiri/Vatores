package br.com.fiap;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome;
	private String idSecreta;
	private String[] poderes;
	private String[] fraquezas;

	public SuperHeroi() {

	}

	public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
		this.nome = nome;
		this.fraquezas = fraquezas;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public String[] getPoderes() {
		return poderes;
	}

	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}

	public String[] getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(String[] fraquezas) {
		this.fraquezas = fraquezas;
	}

	public void listaHeroi() {
		String exibe = "Nome do Heroi: " + nome + "\nIdSecreta: " + idSecreta + "\n";
		int cont = 1;
		for (String i : poderes) {
			exibe += "Poderes " + cont + ": " + i + "\n";
			cont++;
		}
		String exibe2 = "fraquezas: ";
		for (String e : fraquezas) {
			exibe2 += cont + ": " + e + "\n";
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe + exibe2);
	}
}
