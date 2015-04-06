package br.edu.ifrs.farroupilha.engenharia_software_i;

public class Barril {
    private double altura;
    private double diametroCentro;
    private double diametroTampa;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametroCentro() {
        return diametroCentro;
    }

    public void setDiametroCentro(double diametroCentro) {
        this.diametroCentro = diametroCentro;
    }

    public double getDiametroTampa() {
        return diametroTampa;
    }

    public void setDiametroTampa(double diametroTampa) {
        this.diametroTampa = diametroTampa;
    }
    
    public double calculaVolume(){
        return Math.pow((2 * diametroCentro + diametroTampa) * (0.087 * altura), 2);
    }
    
}
