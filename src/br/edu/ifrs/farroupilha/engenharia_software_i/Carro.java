package br.edu.ifrs.farroupilha.engenharia_software_i;

public class Carro {
    private String modeloCarro = null;
    private double quilometragemAtual = 0;
    private double quilometragemAnterior = 0;
    private double litrosConsumidos = 0;

    public String getModeloCarro() {
        return modeloCarro;
    }

    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public double getQuilometragemAnterior() {
        return quilometragemAnterior;
    }

    public double getLitrosConsumidos() {
        return litrosConsumidos;
    }

    public void setLitrosConsumidos(double litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void setQuilometragemAtual(double quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public void setQuilometragemAnterior(double quilometragemAnterior) {
        this.quilometragemAnterior = quilometragemAnterior;
    }
    
    public double calculaMedia(){
        return (quilometragemAnterior - quilometragemAtual) / litrosConsumidos;
    }
    
    
}
