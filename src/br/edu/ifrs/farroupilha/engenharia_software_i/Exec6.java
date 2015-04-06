package br.edu.ifrs.farroupilha.engenharia_software_i;

import javax.swing.JOptionPane;

public class Exec6 {
    
    public static void main (String[] args){
        
        Calendario cal = new Calendario();
        
        cal.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano que deseja ser verificado se é bisexto")));
        
        JOptionPane.showMessageDialog(null, cal.isBisexto() ? "Ano é bisexto" : "Ano não é bisexto" );
        
        
    }
    
}
