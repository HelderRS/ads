package br.edu.ifrs.farroupilha.engenharia_software_i;

import javax.swing.JOptionPane;

public class Exec7 {
	
	public static void main(String[] args){
		Barril barril = new Barril();
		
		barril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do barril")));
		barril.setDiametroCentro(Double.parseDouble(JOptionPane.showInputDialog("Informeo diâmetro central do barril")));
		barril.setDiametroTampa(Double.parseDouble(JOptionPane.showInputDialog("Informe o diâmetro da tampa do barril")));
		
		JOptionPane.showMessageDialog(null, "O volume do barril é de: " + barril.calculaVolume());
	}

}
