package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaEquipe {
	public static void main(String[] args) {
		Equipe grupo;
		String aux, escolha = "sim", nome;
		String[] integrantes;
		int qtde;

		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome da Equipe: ");
				aux = JOptionPane.showInputDialog("Digite a quantidade dos integrates: ");
				qtde = Integer.parseInt(aux);
				integrantes = new String[qtde];
				for (int i = 0; i < integrantes.length; i++) {
					integrantes[i] = JOptionPane.showInputDialog("Integrante " + (i + 1));
				}
				grupo = new Equipe(nome, integrantes);
				grupo.listaEquipe();
				escolha = JOptionPane.showInputDialog("Deseja continuar: sim - nao");

			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "programa finalizado, Até breve");

	}
}
