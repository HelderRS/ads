package br.edu.ifrs.farroupilha.estrutura_dados.trab_quick_merge_sort;

public class QuickSort {
	
	public void sort(int[] vetor, int p, int r){
		int q;
		Executor.ifcount ++;
		
		if (p >= r){
			System.out.println("Volta");
		}
		
		if (p < r){
			q = particao(vetor, p, r);
			System.out.println("sort1(vetor, " + p + ", " + q + ")");
			sort(vetor, p, q);
			System.out.println("sort2(vetor, " + (q + 1) + ", " + r + ")");
			sort(vetor, q + 1, r);
			
		}
		
	}
	
	private int particao(int[] vetor, int p, int r){
		System.out.println("particao(vetor," + p + ", " + r + ")");
		int pivo, i, j;
		pivo = vetor[(p + r) / 2];
		i = p - 1;
		j = r + 1;
		
		while (i < j){
			do{
				j--;
			}
				while (vetor[j] > pivo);
			
			do{
				i++;
			}
				while (vetor[i] < pivo);
			Executor.ifcount ++;
			if (i < j){
				troca(vetor, i, j);
			}
		}
		System.out.println("Retorno particao: " + j);
		return j;
	}
	
	private void troca(int[] vetor, int i, int j){
		System.out.println("troca(vetor, " + i + ", " + j + ")" );
		int aux;
		aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
		
		for (int num : vetor){
			System.out.print(num);
			System.out.print(", ");
		}
		System.out.println(" ");
	}

}
