package Adapter;

/**
 *
 * @author tunnes
 * 
 */
public class PatoBranco implements Pato {
    
    @Override
    public void grasnar() {
        System.out.println("Grasnou como pato branco");
    }
    
    @Override
    public void voar() {
        System.out.println("Voou como pato branco");
    }
    
}
