/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tarcisio
 */
public class CanaisEducativos implements AgregadoDeCanais {
    private  Map<Integer, Canal> canais;
    
    public CanaisEducativos() {
        this.canais = new HashMap<Integer, Canal>();
        canais.put(0, new Canal("","", "resources/img/slide-1.jpg"));
        canais.put(1, new Canal("","", "resources/img/slide-2.jpg"));
        canais.put(2, new Canal("","", "resources/img/slide-3.jpg"));
        canais.put(3, new Canal("","", "resources/img/slide-4.jpg"));
    }
    
    @Override
    public IteradorInterface criarIterator() {
        return new IteradorHashMapDeCanais(this.canais);        
    }
    
}
