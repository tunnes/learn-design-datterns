/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Map;

/**
 *
 * @author tarcisio
 */
public class IteradorHashMapDeCanais implements IteradorInterface {
    protected  Map<Integer, Canal> lista;
    protected  int hashKey;
    
    IteradorHashMapDeCanais(Map<Integer, Canal> canais) {
        this.lista   = canais;
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
