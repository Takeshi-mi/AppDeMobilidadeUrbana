/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdemobilidade;

import java.util.Arrays;

/**
 *
 * @author Takeshi
 */
public class Carro {
    private int id;
    private int idCliente;
    private int idMotorista;
    private double[] origemCoordenada; // [32819839,-132199]
    private double [] destinoDestino;
    private String origemNome;
    private String destinoNome;
    private double valor;
    private double avaliacao;
    
    public Carro(){}

    public Carro(int id, int idCliente, int idMotorista, double[] origemCoordenada, double[] destinoDestino, String origemNome, String destinoNome, double valor, double avaliacao) {
        this.id = id;
        this.idCliente = idCliente;
        this.idMotorista = idMotorista;
        this.origemCoordenada = origemCoordenada;
        this.destinoDestino = destinoDestino;
        this.origemNome = origemNome;
        this.destinoNome = destinoNome;
        this.valor = valor;
        this.avaliacao = avaliacao;
    }
        public Carro(int id, int idCliente, int idMotorista, double[] origemCoordenada, String origemNome) {
        this.id = id;
        this.idCliente = idCliente;
        this.idMotorista = idMotorista;
        this.origemCoordenada = origemCoordenada;
//        this.destinoDestino = destinoDestino;
        this.origemNome = origemNome;

    }
    
    public void exibirDados(){
        System.out.printf("""
                          id: %d
                          idCliente:  %d
                          idMotorista: %d
                          Endereço de origem:¨%s 
                          Coordenada de origem: %s""",id, idCliente, idMotorista, origemNome,Arrays.toString(origemCoordenada));
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

    public double[] getDestinoDestino() {
        return destinoDestino;
    }

    public void setDestinoDestino(double[] destinoDestino) {
        this.destinoDestino = destinoDestino;
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
