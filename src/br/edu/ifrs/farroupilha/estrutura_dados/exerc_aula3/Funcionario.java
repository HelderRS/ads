package br.edu.ifrs.farroupilha.estrutura_dados.exerc_aula3;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
