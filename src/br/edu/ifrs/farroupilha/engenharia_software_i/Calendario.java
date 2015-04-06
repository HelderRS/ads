package br.edu.ifrs.farroupilha.engenharia_software_i;

public class Calendario {
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean isBisexto(){
        if (( ano % 4 ) == 0){
        return true;
    }
        else{
            return false;
        }
    }
    
    
}
