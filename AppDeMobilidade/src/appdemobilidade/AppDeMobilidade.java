/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appdemobilidade;

/**
 *
 * @author Takeshi
 */
public class AppDeMobilidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] test = new double[3];
        test[1] = 4321.23;
        test[0] = -3444.2;
        
        Carro c1 = new Carro(1, 10, 20, test, "Formosa-Go, Setor Bosque, Avenida 2");
        c1.exibirDados();
    }
    
}
