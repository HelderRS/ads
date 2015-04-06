package br.edu.ifrs.farroupilha.estrutura_dados.trab_sort;

public class MergeSort {
	
	private void intercala(int[] vetor, int inicio, int fim, int meio){
		int posLivre, iniVetorUm, iniVetorDois, i;
		int[] aux = new int[vetor.length];
		
		iniVetorUm = inicio;
		iniVetorDois = meio + 1;
		posLivre = inicio;
		
		while(iniVetorUm <= meio && iniVetorDois <= fim){
			
			if (vetor[iniVetorUm] <= vetor[iniVetorDois]){
				aux[posLivre] = vetor[iniVetorUm];
				iniVetorUm++;
			}else{
				aux[posLivre] = vetor[iniVetorDois];
				iniVetorDois++;
			}
			posLivre++;
		}
		
		for (i=iniVetorUm; i<=meio; i++){
			aux[posLivre] = vetor[i];
			posLivre++;
		}
		
		for(i=iniVetorDois; i<=fim; i++){
			aux[posLivre] = vetor[i];
			posLivre++;			
		}
		
		for(i=inicio; i<=fim; i++){
			vetor[i] = aux[i];
		}
	}
	
	public void sort(int[] vetor, int iniVetor, int fimVetor){
		int meio;
		if (iniVetor < fimVetor){
			meio = (iniVetor + fimVetor) / 2;
			sort(vetor, iniVetor, fimVetor);
			sort(vetor, meio + 1, fimVetor);
			intercala(vetor, iniVetor, fimVetor, meio);
		}
		
	}

}
