package br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3;

public class Busca {
	private int compBinario=0;
	private int compSequencial=0;
	
	public int sequencial(Produto[] vetor, int codProduto){
		for (int i=0; i < vetor.length ; i++){
			compSequencial++;
			if (codProduto == vetor[i].getCodigo() ){
				return i;
			}
		}
		return -1;
						
	}
	
	public int binario(Produto[] vetor, int codProduto){
		int inicio = 0;
		int fim = vetor.length-1;
 
		compBinario++;
		while(inicio <= fim){
			
			int meio = (inicio+fim)/2;
			compBinario++;
			if(vetor[meio].getCodigo() == codProduto){
				return meio;
			}
			
			compBinario++;
			if(codProduto > vetor[meio].getCodigo()){
				inicio = meio+1;
			} else {
				fim = meio-1;
			}
		}
		return -1;
	}

	public int getCompBinario() {
		return compBinario;
	}

	public void setCompBinario(int compBinario) {
		this.compBinario = compBinario;
	}

	public int getCompSequencial() {
		return compSequencial;
	}

	public void setCompSequencial(int compSequencial) {
		this.compSequencial = compSequencial;
	}

}
