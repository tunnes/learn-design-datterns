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
public class CanaisSeries implements AgregadoDeCanais{
    private Hashtable<Integer, Canal> canais;    
    public CanaisSeries() {
        this.canais = new Hashtable<Integer, Canal>();
        this.canais.put(0, new Canal("Fox", "VH-21", "http://data.whicdn.com/images/69887292/large.gif"));
        this.canais.put(1, new Canal("AMC", "UHF-54", "http://15858-presscdn-0-65.pagely.netdna-cdn.com/wp-content/uploads/2015/02/Mercury_smaller.gif"));
        this.canais.put(2, new Canal("HBO Series", "UHF-06", "https://images.hellogiggles.com/uploads/2016/10/02153220/westworld.gif"));
    }
    @Override
    public IteradorInterface criarIterator() {
        return new IteradorHashTableDeCanais(canais);
    }
}
