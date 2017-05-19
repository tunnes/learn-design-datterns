/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author lab5
 */
public class Gato implements Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("MIAU");
    }
        
    @Override
    public void accept(ChecarVisitor v) {
        v.checar(this);
    }
}
