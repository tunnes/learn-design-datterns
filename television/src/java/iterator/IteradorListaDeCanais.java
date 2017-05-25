/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author tunnes
 */
public class IteradorListaDeCanais implements IteradorInterface {
 
    private ArrayList<Canal> lista;
    private int contador;
 
    public IteradorListaDeCanais(ArrayList<Canal> lista) {
        this.lista = lista;
        contador = 0;
    }
 
    public void first() {
        contador = 0;
    }
 
    public void next() {
        contador++;
    }
    
    @Override    
    public void prev(){
        contador--;
    }
 
    public boolean isDone() {
        return contador == lista.size();
    }
 
    public Canal currentItem() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }
}
