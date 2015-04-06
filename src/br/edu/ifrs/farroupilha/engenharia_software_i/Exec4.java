
package br.edu.ifrs.farroupilha.engenharia_software_i;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Exec4 {


    public static void main(String[] args) {
        Carro carro = new Carro();
                
        DecimalFormat df = new DecimalFormat("#.000");  
        
        carro.setModeloCarro(JOptionPane.showInputDialog(null, "Informe o modelo de seu carro"));
        carro.setQuilometragemAtual(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quilometragem atual")));
        carro.setQuilometragemAnterior(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quilometragem anterior")));
        carro.setLitrosConsumidos(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os litros consumidos")));
  
        JOptionPane.showMessageDialog(null, "Média de " + df.format(carro.calculaMedia()) + " quilômetros por litro");
        
    }
}
