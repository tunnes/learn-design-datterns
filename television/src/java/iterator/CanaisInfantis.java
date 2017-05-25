/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;


/**
 *
 * @author tunnes
 */
public class CanaisInfantis implements AgregadoDeCanais{
    private Canal[] canais = new Canal[4];
    
    public CanaisInfantis() {
        this.canais[0] = new Canal("animax", "VH-55", "https://media.tenor.co/images/9fdf5ca36e0f8882d172c8ccd27586ad/tenor.gif");
        this.canais[1] = new Canal("boomerang", "VH-32", "http://bisma29.webs.com/animation_tecna02.gif");
        this.canais[2] = new Canal("nickelodeon", "VF-46", "https://media.giphy.com/media/DzeI9M45s7xiU/giphy.gif");
        this.canais[3] = new Canal("Mtv", "AN-11", "https://68.media.tumblr.com/tumblr_m1klpyIjUL1rs55b4o1_500.gif");        
    }
 
    @Override
    public IteradorMatrizDeCanais criarIterator() {
        return new IteradorMatrizDeCanais(this.canais);
    }
}
