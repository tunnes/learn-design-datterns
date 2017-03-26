package Enum;

/**
 *
 * @author tunnes
 * 
 */
public enum Animal {
    CACHORRO {
        @Override
        public void emitirSom() {
            System.out.println("Au Au");
        }
    }, 
    GATO {
        @Override
        public void emitirSom() {
            System.out.println("Miau Miau");
        }
    }, 
    PORCO {
        @Override
        public void emitirSom() {
            System.out.println("Oinc Oinc");
        }
    };
    
    public abstract void emitirSom();
}
