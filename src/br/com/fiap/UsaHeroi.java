package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaHeroi {
	public static void main(String[] args) {
		SuperHeroi SH;
		String aux, escolha = "sim", nome, idSecreto;
		String[] poderes;
		String[] fraquezas;
		int qtde,qtde1;

		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome do Super Heroi: ");
				idSecreto = JOptionPane.showInputDialog("Digite o idSecreto: ");
				aux = JOptionPane.showInputDialog("Digite a quantidade dos poderes: ");
				qtde = Integer.parseInt(aux);
				poderes = new String[qtde];
				aux = JOptionPane.showInputDialog("Digite a quantidade das fraquezas: ");
				qtde1 = Integer.parseInt(aux);
				fraquezas = new String[qtde1];
				for (int i = 0; i < poderes.length; i++) {
					poderes[i] = JOptionPane.showInputDialog("poder: " + (i + 1));
				}
				for (int e = 0; e < fraquezas.length; e++) {
					fraquezas[e] = JOptionPane.showInputDialog("fraqueza; " + (e + 1));
				}
				SH = new SuperHeroi(nome, idSecreto, poderes, fraquezas);
				SH.listaHeroi();
				escolha = JOptionPane.showInputDialog("Deseja continuar: sim - nao");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "fim do programa, Até breve");
	}
}
