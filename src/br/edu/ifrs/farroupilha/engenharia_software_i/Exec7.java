package br.edu.ifrs.farroupilha.engenharia_software_i;

import javax.swing.JOptionPane;

public class Exec7 {
	
	public static void main(String[] args){
		Barril barril = new Barril();
		
		barril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do barril")));
		barril.setDiametroCentro(Double.parseDouble(JOptionPane.showInputDialog("Informeo di�metro central do barril")));
		barril.setDiametroTampa(Double.parseDouble(JOptionPane.showInputDialog("Informe o di�metro da tampa do barril")));
		
		JOptionPane.showMessageDialog(null, "O volume do barril � de: " + barril.calculaVolume());
	}

}
