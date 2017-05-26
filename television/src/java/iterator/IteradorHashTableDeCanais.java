/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Hashtable;

/**
 *
 * @author lab2
 */
public class IteradorHashTableDeCanais implements IteradorInterface {
    protected Hashtable<Integer, Canal> lista;
    protected int hashKey;
    IteradorHashTableDeCanais(Hashtable <Integer, Canal> lista) {
        this.lista   = lista;
        this.hashKey = 0;
    }
    @Override
    public void first() {
        this.hashKey = 0;
    }

    @Override
    public void next() {
        this.hashKey++;
    }

    @Override
    public void prev() {
       this.hashKey--;
    }

    @Override
    public boolean isDone() {
      return this.hashKey == this.lista.size();
    }

    @Override
    public Canal currentItem() {
        if (isDone()) {
            hashKey = lista.size() - 1;
        } else if (hashKey < 0) {
            hashKey = 0;
        }        
        return this.lista.get(hashKey);
    }
    
}
