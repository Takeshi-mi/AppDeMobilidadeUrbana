/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdemobilidade;
public class Passageiro extends Usuario{
    private boolean statusCorrida;
    private double avaliacao;
    private Cartao cartao;
    private Corrida corridaAtual;
    
    public void solicitarCorrida(){
        System.out.println("Procurando motorista...");
        if (this.statusCorrida) {
            System.out.println("Corrida aceita.");
        }
    }
    
    public void cancelarCorrida(){
        this.statusCorrida = false;
        System.out.println("Corrida cancelada.");
    }
    
    public double avaliarCorrida(double nota){
        this.avaliacao = nota;
        return this.avaliacao;
    }
    
    public double avaliarMotorista(double nota){
        return nota;
    }
    
    public boolean pagar(){
        return true;
    }
    
    public Corrida monitorarCorrida(){
        return this.corridaAtual;
    }
    
    public void cadastrarCartao(Cartao cartao){
        this.cartao = cartao;
        System.out.println("Cartão cadastrado com sucesso!");
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

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Corrida getCorridaAtual() {
        return corridaAtual;
    }

    public void setCorridaAtual(Corrida corridaAtual) {
        this.corridaAtual = corridaAtual;
    }
    
    
    
}
