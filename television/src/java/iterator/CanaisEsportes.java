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

public class CanaisEsportes implements AgregadoDeCanais{
    private ArrayList<Canal> canais = new ArrayList<>();
 
    public CanaisEsportes() {
        this.canais.add(new Canal("ESPN", "VF-11", "https://i.makeagif.com/media/11-09-2015/pEk4kz.gif"));
        this.canais.add(new Canal("SPORT TV", "VH-13", "https://usatftw.files.wordpress.com/2015/09/stamp.gif"));
        this.canais.add(new Canal("band esportes", "VD-42", "http://www.totalprosports.com/wp-content/uploads/2013/01/phil-dawson-trick-kick.gif"));
    }
 
    @Override
    public IteradorListaDeCanais criarIterator() {
        return new IteradorListaDeCanais(this.canais);
    }
}
