package br.edu.ifrs.farroupilha.estrutura_dados.trab_quick_merge_sort;

public class Executor {
	
	static int ifcount = 0;

	public static void main(String[] args) {
		
		int[] vetor = new int[]{3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};

		for (int i : vetor){
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println("");
		
		
//		QuickSort quickSort = new QuickSort();
//		quickSort.sort(vetor, 0, 15);
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(vetor, 0, 15);
		
		for (int i : vetor){
			System.out.print(i);
			System.out.print(", ");
		}
		
		System.out.println("");
		System.out.println("Contador de IF:" + ifcount);
		
	}

}
