package br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3;

import javax.swing.JOptionPane;

import br.edu.ifrs.farroupilha.estrutura_dados.trab_sort.BubbleSort;

public class Exerc2 {
	
	public static void main (String[] args){
		
		int[] vetor = new int[10];
		int qtdMaior = 1;
		int qtdMenor = 1;
		
	JOptionPane.showMessageDialog(null, "Informe 10 números");
	for (int i=0; i < 10; i++){
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número"));
	}

	BubbleSort bubbleSort = new BubbleSort();
	bubbleSort.sort(vetor);
	
	
	for (int i=vetor.length - 1; i > 0; i--){
		if (vetor[i] != vetor[i - 1]){
			break;
		}else{
			qtdMaior++;
		}
	}
	
	for (int i=0; i < vetor.length - 1; i++){
		if (vetor[i] != vetor[i + 1]){
			break;
		}else{
			qtdMenor++;
		}
	}
	
	JOptionPane.showMessageDialog(null, "O menor número é: " + vetor[0] + ", e aparece " + qtdMenor + " vezes no vetor");
	JOptionPane.showMessageDialog(null, "O maior número é: " + vetor[vetor.length - 1] + ", e aparece " + qtdMaior + " vezes no vetor");
	
	}

}
