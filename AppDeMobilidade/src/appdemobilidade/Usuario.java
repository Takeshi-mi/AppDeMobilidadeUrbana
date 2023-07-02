/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdemobilidade;

import javax.crypto.SealedObject;

public class Usuario {
    private int id;
    private String senha;
    private String nomeCompleto;
    private String email;
    private Double saldo;
    private char genero;
    
    public Usuario(){}
    public Usuario(int id, String senha, String nomeCompleto, String email, Double saldo, char genero){
        this.id = id;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.saldo = saldo;
        this.genero = genero;
    }
    
    public void login(){
       //Verificar email e senha no banco de DADOS E FAZER A VAALIDAÇÃO.
        System.out.println("Login realizado com sucesso");
    }
    public void cadastrarConta(){
        //Puxe no banco de dados
        System.out.println("Direcionar para tela de cadastro");
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    
    
    
}
