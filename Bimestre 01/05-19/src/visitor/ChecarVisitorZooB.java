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

public class ChecarVisitorZooB implements ChecarVisitor{

    @Override
    public void checar(Cachorro c) {
        System.out.println("Cachorro no ZooB " + c);     
    }

    @Override
    public void checar(Gato g) {
        System.out.println("Gato no ZooB " + g);
    }


    
}
