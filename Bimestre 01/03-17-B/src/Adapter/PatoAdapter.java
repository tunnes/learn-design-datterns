package Adapter;

/**
 *
 * @author tunnes
 * 
 */
public class PatoAdapter implements Pato {
    private final Peru peru;
    
    public PatoAdapter(Peru peru) {
        this.peru = peru;
    }

    @Override
    public void grasnar() {
        this.peru.wooble();
    }
    @Override
    public void voar() {
        this.peru.baterAsas();
    }
}
