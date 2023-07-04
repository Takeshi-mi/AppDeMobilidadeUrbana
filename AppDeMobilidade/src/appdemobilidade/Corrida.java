/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdemobilidade;
public class Corrida {
    private int id;
    private int idCliente; // Poderia ser um objeto do tipo cliente. Que na verdade é do tipo passageiro. 
    private int idMotorista;
    private double[] origemCoordenada;
    private double[] destinoCoordenada;
    private String origemNome;
    private String destinoNome;
    private double valor;
    private double avaliacao;
    
    private void exibirDados(){
        // optamos por não printar a coordenada nesse método, pois achamos que faz mais sentido assim.
        System.out.println("ID: " + this.id);
        System.out.println("ID Cliente: " + this.idCliente);
        System.out.println("ID Motorista: " + this.idMotorista);
        System.out.println("Local de origem: " + this.origemNome);
        System.out.println("Local de destino: " + this.destinoNome);
        System.out.println("Valor: RS" + this.valor);
        System.out.println("Avaliação: " + this.avaliacao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public double[] getOrigemCoordenada() {
        return origemCoordenada;
    }

    public void setOrigemCoordenada(double[] origemCoordenada) {
        this.origemCoordenada = origemCoordenada;
    }

    public double[] getDestinoCoordenada() {
        return destinoCoordenada;
    }

    public void setDestinoCoordenada(double[] destinoCoordenada) {
        this.destinoCoordenada = destinoCoordenada;
    }

    public String getOrigemNome() {
        return origemNome;
    }

    public void setOrigemNome(String origemNome) {
        this.origemNome = origemNome;
    }

    public String getDestinoNome() {
        return destinoNome;
    }

    public void setDestinoNome(String destinoNome) {
        this.destinoNome = destinoNome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
