package br.edu.ifrs.farroupilha.estrutura_dados.trab_sort;

import br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3.Funcionario;

public class InsertionSort {
	
	public void sort(int[] vetor){
		int eleito, j;
		
		for(int i=0; i < vetor.length; i++){
			
			eleito = vetor[i];
			j = i - 1;
			
			while (j >= 0 && vetor[j] > eleito){
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = eleito;
						
		}
	}
	
	public void orderBySalario(Funcionario[] vetor){
		int j;
		Funcionario eleito;
		
		for(int i=0; i < vetor.length; i++){
			
			eleito = vetor[i];
			j = i - 1;
			
			while (j >= 0 && vetor[j].getSalario() > eleito.getSalario()){
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = eleito;		
		}
	}
	
	public void orderByNome(Funcionario[] vetor){
		int j;
		Funcionario eleito;
		
		for(int i=0; i < vetor.length; i++){
			
			eleito = vetor[i];
			j = i - 1;
			
			while (j >= 0 && vetor[j].getNome().compareToIgnoreCase(eleito.getNome()) > 0){
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = eleito;		
		}
	}
	
	public void invertOrderBySalario(Funcionario[] vetor){
		int j;
		Funcionario eleito;
		
		for(int i=0; i < vetor.length; i++){
			
			eleito = vetor[i];
			j = i - 1;
			
			while (j >= 0 && vetor[j].getSalario() < eleito.getSalario()){
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = eleito;		
		}
	}
}
