package br.edu.ifrs.farroupilha.estrutura_dados.trab_sort;

import br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3.Funcionario;

public class SelectionSort {
	
	public void sort(int[] vetor){
		
		for (int i = 0; i < vetor.length - 1; i++) {
			int menor = i;
	 
			for (int j = menor + 1; j < vetor.length; j++){
				if (vetor[j] < vetor[menor]){
					menor = j;
				}
			}
			
			if (menor != i) {
                int t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
			}
		}
	}
	
	public void orderBySalario(Funcionario[] vetor){
		
		for (int i = 0; i < vetor.length - 1; i++) {
			int menor = i;
	 
			for (int j = menor + 1; j < vetor.length; j++){
				if (vetor[j].getSalario() < vetor[menor].getSalario()){
					menor = j;
				}
			}
			
			if (menor != i) {
                Funcionario t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
			}
		}
	}
	
	public void orderByNome(Funcionario[] vetor){
		
		for (int i = 0; i < vetor.length - 1; i++) {
			int menor = i;
	 
			for (int j = menor + 1; j < vetor.length; j++){
				if (vetor[j].getNome().compareToIgnoreCase(vetor[menor].getNome()) < 0){
					menor = j;
				}
			}
			
			if (menor != i) {
                Funcionario t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
			}
		}
	}
	
	public void invertOrderBySalario(Funcionario[] vetor){
		
		for (int i = 0; i < vetor.length - 1; i++) {
			int menor = i;
	 
			for (int j = menor + 1; j < vetor.length; j++){
				if (vetor[j].getSalario() > vetor[menor].getSalario()){
					menor = j;
				}
			}
			
			if (menor != i) {
                Funcionario t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
			}
		}
	}

}
		
		


