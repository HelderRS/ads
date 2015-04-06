package br.edu.ifrs.farroupilha.estrutura_dados.trab_sort;

import javax.swing.JOptionPane;

public class Executor {

	public static void main(String[] args) {
		int qtd_pos_vetor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desejada de posições do vetor"));
		
		
		int[] vetorOriginal = new int[qtd_pos_vetor];
		
		for (int i=0; i < qtd_pos_vetor; i++){
			vetorOriginal[i] = (int) (Math.random() * Math.pow(qtd_pos_vetor, 2)  );
		}
		
		/*BubbleSort*/
		
		int[] vetorBubbleSort = vetorOriginal;
	    long tempoInicioBubbleSort = System.currentTimeMillis();
	    long tempoFinalBubbleSort;
	    
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(vetorBubbleSort);
		
		tempoFinalBubbleSort = System.currentTimeMillis() - tempoInicioBubbleSort;
		/*----------------------------------------------------------------------------------------------------------*/
		
		
		/*InsertionSort*/
		int[] vetorInsertionSort = vetorOriginal;
	    long tempoInicioInsertionSort = System.currentTimeMillis();
	    long tempoFinalInsertionSort;
	    
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(vetorInsertionSort);
		
		tempoFinalInsertionSort = System.currentTimeMillis() - tempoInicioInsertionSort;
		/*----------------------------------------------------------------------------------------------------------*/
		
		
		/*SelectionSort*/
		int[] vetorSelectionSort = vetorOriginal;
	    long tempoInicioSelectionSort = System.currentTimeMillis();
	    long tempoFinalSelectionSort;
	    
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(vetorSelectionSort);
		
		tempoFinalSelectionSort = System.currentTimeMillis() - tempoInicioSelectionSort;
		/*----------------------------------------------------------------------------------------------------------*/
		
		/*MergeSort*/
		int[] vetorMergeSort = vetorOriginal;
	    long tempoInicioMergeSort = System.currentTimeMillis();
	    long tempoFinalMergeSort;
	    
	    MergeSort mergeSort = new MergeSort();
	    mergeSort.sort(vetorMergeSort, 0, vetorMergeSort.length -1);
		
	    tempoFinalMergeSort = System.currentTimeMillis() - tempoInicioMergeSort;
		/*----------------------------------------------------------------------------------------------------------*/		

		StringBuffer sb = new StringBuffer();
		sb.append("Tempo de execução do Bubble Sort    : " + tempoFinalBubbleSort  + " milisegundos\n");
		sb.append("Tempo de execução do Insertion Sort : " + tempoFinalInsertionSort + " milisegundos\n");
		sb.append("Tempo de execução do Selection Sort : " + tempoFinalSelectionSort  + " milisegundos\n");
		sb.append("Tempo de execução do Merge Sort     : " + tempoFinalMergeSort  + " milisegundos\n");
		
		JOptionPane.showMessageDialog(null, sb.toString());
	}

}
