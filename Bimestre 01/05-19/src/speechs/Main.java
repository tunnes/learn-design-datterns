/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speechs;

/**
 *
 * @author lab5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        c.emitirSom();
        g.emitirSom();
        ZooB z = new ZooB();
        // No java é definido em tempo de execucao qual o metodo a ser chamado baseado em seu tipo;
        // No argumentos (sobrecarga), o metodo a ser chamado é definido em tempo de compilcão;
        z.checar(c);
        // Dynamic Speech -> Tempo de execução.
        // Staic Speech -> Tempo de compilacao.      
        // Java é Single Speech;
        
    }
    
}
