package br.edu.ifrs.farroupilha.estrutura_dados.trab_sort;

import br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3.Funcionario;

public class BubbleSort {
	
	public void sort(int[] vetor){
		int aux;
		
		for (int i=0; i < vetor.length; i++){
			for (int j=0; j < (vetor.length - 1); j++){
				
				if (vetor[j] > vetor[j + 1]){
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		
		}
				
	}
	
	public void orderBySalario(Funcionario[] vetor){
		Funcionario aux;
		
		for (int i=0; i < vetor.length; i++){
			for (int j=0; j < (vetor.length - 1); j++){
				
				if (vetor[j].getSalario() > vetor[j + 1].getSalario()){
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		
		}
		
	}
	
	public void invertOrderBySalario(Funcionario[] vetor){
		Funcionario aux;
		
		for (int i=0; i < vetor.length; i++){
			for (int j=0; j < (vetor.length - 1); j++){
				
				if (vetor[j].getSalario() < vetor[j + 1].getSalario()){
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		
		}
		
	}
	
	public void orderByNome(Funcionario[] vetor){
		Funcionario aux;
		
		for (int i=0; i < vetor.length; i++){
			for (int j=0; j < (vetor.length - 1); j++){
				
				if (vetor[j].getNome().compareTo(vetor[j + 1].getNome()) > 0){
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		
		}

	}

}
