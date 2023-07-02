/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdemobilidade;
public class Motorista extends Usuario {
    private Carro carro;
    private boolean statusCorrida;
    private double avaliacao;
    private String cnh;
    private Corrida corridaAtual;
    
    public void aceitarCorrida(){
        this.statusCorrida = true;
        System.out.println("Corrida aceita.");
    }
    
    public void cancelarCorrida(){
        this.statusCorrida = false;
        System.out.println("Corrida cancelada.");
    }
    
    public void iniciarCorrida(){
        if(this.statusCorrida){
            System.out.println("Iniciando corrida...");
        }
    }
    
    public void finaliarCorrida(){
        if(!this.statusCorrida){
            System.out.println("Finalizando corrida...");
        }
    }
    
    public double avaliarPassageiro(double nota){
        return nota;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public boolean isStatusCorrida() {
        return statusCorrida;
    }

    public void setStatusCorrida(boolean statusCorrida) {
        this.statusCorrida = statusCorrida;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Corrida getCorridaAtual() {
        return corridaAtual;
    }

    public void setCorridaAtual(Corrida corridaAtual) {
        this.corridaAtual = corridaAtual;
    }
    
    
}
