package br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3;

import javax.swing.JPanel;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import br.edu.ifrs.farroupilha.estrutura_dados.trab_sort.BubbleSort;
import br.edu.ifrs.farroupilha.estrutura_dados.trab_sort.InsertionSort;
import br.edu.ifrs.farroupilha.estrutura_dados.trab_sort.SelectionSort;

public class Exerc1 {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Juca", 1500);
		Funcionario func2 = new Funcionario("Vande", 3400);
		Funcionario func3 = new Funcionario("Tonho", 1700);
		Funcionario func4 = new Funcionario("Maria", 1357);
		Funcionario func5 = new Funcionario("Elias", 2000);
		
		
		
		
		Funcionario[] vetor = new Funcionario[]{func1, func2, func3, func4, func5};
		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectioSort = new SelectionSort();
//		bubbleSort.orderBySalario(vetor);
//		bubbleSort.orderByNome(vetor);
//		bubbleSort.invertOrderBySalario(vetor);
//		insertionSort.orderBySalario(vetor);
//		insertionSort.invertOrderBySalario(vetor);
//		insertionSort.orderByNome(vetor);
//		selectioSort.orderBySalario(vetor);
//		selectioSort.orderByNome(vetor);
		selectioSort.invertOrderBySalario(vetor);
		
		for (Funcionario func : vetor){
			System.out.print(func.getNome() + " - ");
			System.out.println(func.getSalario());
		}
		
		
		
	}

}
