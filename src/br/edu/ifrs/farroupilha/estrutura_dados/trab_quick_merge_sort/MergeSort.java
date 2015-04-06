package br.edu.ifrs.farroupilha.estrutura_dados.trab_quick_merge_sort;

public class MergeSort {
	
	private void intercala(int[] vetor, int inicio, int fim, int meio){
		int poslivre, inicio_vetor1, inicio_vetor2, i;
		int aux[] = new int[vetor.length];
		inicio_vetor1 = inicio;
		inicio_vetor2 = meio + 1;
		poslivre = inicio;

		System.out.println("intercala(vetor, " + inicio + ", " + fim + ", " + meio + ")");
		
		while (inicio_vetor1 <= meio && inicio_vetor2 <= fim){
			if (vetor[inicio_vetor1] <= vetor[inicio_vetor2]){
				aux[poslivre] = vetor[inicio_vetor1];
				inicio_vetor1++;
			}else{
				aux[poslivre] = vetor[inicio_vetor2];
				inicio_vetor2++;
			}
		poslivre++;
		}
		for(i=inicio_vetor1; i<=meio; i++){
			aux[poslivre] = vetor[i];
			poslivre++;
		}
		for (i=inicio_vetor2; i<=fim; i++){
			aux[poslivre] = vetor[i];
			poslivre++;
		}
		for (i=inicio;i<=fim;i++){
			vetor[i] = aux[i];
		}
		
		for (int num : vetor){
			System.out.print(num);
			System.out.print(", ");
		}
		System.out.println("");
	}
	
	public void sort (int[] vetor, int inicio, int fim){
		int meio;
		if(inicio >= fim){
			System.out.println("Volta");
		}
		if (inicio < fim){
			meio = (inicio + fim) / 2;
			System.out.println("sort1(vetor, " + inicio + ", " + meio + ")");
			sort(vetor, inicio, meio);
			System.out.println("sort2(vetor, " + (meio + 1) + ", " + fim + ")");
			sort(vetor, meio + 1, fim);
			intercala(vetor, inicio, fim, meio);
		}
	}

}
