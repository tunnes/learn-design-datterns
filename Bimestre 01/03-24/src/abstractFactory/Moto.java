/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author tunnes
 */
public abstract class Moto {
    private String modelo;
    private double preco;
    private int ano;
    
    Moto(String modelo, double preco, int ano){
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getAno(){
        return this.ano;
    }
}
