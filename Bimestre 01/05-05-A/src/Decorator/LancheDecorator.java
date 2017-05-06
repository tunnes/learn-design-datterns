/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author lab5
 */
public class LancheDecorator extends Lanche{
    protected Lanche prox;
    
    public LancheDecorator(double preco, String nome, Lanche proximo){
        super(preco, nome);
        this.prox = proximo;
    }
    
    @Override
    public String getNome(){
        return prox.getNome() + ", " + super.getNome();
    }

    @Override
    public double getPreco(){
        return prox.getPreco() + super.getPreco();
    }    
}
