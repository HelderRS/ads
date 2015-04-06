package br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3;

import javax.swing.JOptionPane;

public class Exerc3 {

	public static void main(String[] args) {
		
		final int QTD = 2;
		Produto[] vetor = new Produto[QTD];
		String aux;
		String[] vetAux;
		int codProd;
		
		JOptionPane.showMessageDialog(null, "Informe o cadastro de " + QTD + " produtos a seguir");
		for (int i=0; i<QTD; i++){
			aux = JOptionPane.showInputDialog("Informe o " + (i + 1) + "� produto, informando c�digo,descricao,pre�o seprados por v�rgula");
			vetAux = aux.split(",");
			vetor[i] = new Produto(Integer.parseInt(vetAux[0]), vetAux[1], Double.parseDouble(vetAux[2]));		
		}
		
		codProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do produto que deseja pesquisar"));
		
		
		Busca busca = new Busca();
		
		JOptionPane.showMessageDialog(null, "O c�digo pesquisado est� na posi��o " + busca.sequencial(vetor, codProd) + " do vetor ");;
		busca.binario(vetor, codProd);
		
		JOptionPane.showMessageDialog(null, "Quantidade de compara��es\n\nSequencial: " + busca.getCompSequencial() + "\nBin�ria: " + busca.getCompBinario());
		
	}

}
